package com.bpcl.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpcl.dto.CBDataDTO;
import com.bpcl.dto.PackDetailsDTO;
import com.bpcl.entity.BpclCapCouponDetails;
import com.bpcl.entity.BpclLabelRegister;
import com.bpcl.entity.BpclPrimaryCapLabelVerify;
import com.bpcl.repository.BpclCapCouponDetailsRepository;
import com.bpcl.repository.BpclLabelRegisterRepository;
import com.bpcl.repository.BpclPrimaryCapLabelVerifyRepository;

@Service
public class PrimaryPackService {

	private static final Logger log = LoggerFactory.getLogger(PrimaryPackService.class);

	@Autowired
	private BpclPrimaryCapLabelVerifyRepository primaryVerifyRepo;

	@Autowired
	private BpclLabelRegisterRepository labelregisterrepo;

	@Autowired
	private BpclCapCouponDetailsRepository capCouponRepo;

	public void primarypackverify(CBDataDTO data) {
		List<PackDetailsDTO> packDetails = data.getPackDetails();

		if (packDetails == null || packDetails.isEmpty()) {
			log.warn("Pack details are missing → Skipping processing.");
			return;
		}

		String labelCode = packDetails.get(0).getLabelCode();
		String capCode = packDetails.get(0).getCapCode();
		String cbStatus = data.getStatus();

		switch (cbStatus) {
		case "ALREADY_SCANNED":
		case "FAIL":
		case "ERROR":
			BpclPrimaryCapLabelVerify entity = new BpclPrimaryCapLabelVerify();
			entity.setCapQrCode(capCode);
			entity.setLabelCode(labelCode);
			entity.setCbStatus(cbStatus);
			entity.setSerStatus("FAIL");
			entity.setAggregatedOn(data.getAggregatedOn());
			entity.setCreatedBy("1");
			entity.setCreatedOn(LocalDateTime.now());

			primaryVerifyRepo.save(entity);
			log.info("Saved CB status: {} → Cap: {}, Label: {}", cbStatus, capCode, labelCode);
			break;

		case "SUCCESS":
			// Step 1: Insert new verify record with serStatus = null
			BpclPrimaryCapLabelVerify newEntity = new BpclPrimaryCapLabelVerify();
			newEntity.setCapQrCode(capCode);
			newEntity.setLabelCode(labelCode);
			newEntity.setCbStatus(cbStatus);
			newEntity.setSerStatus(null);
			newEntity.setAggregatedOn(data.getAggregatedOn());
			newEntity.setCreatedBy("1");
			newEntity.setCreatedOn(LocalDateTime.now());

			BpclPrimaryCapLabelVerify savedEntity = primaryVerifyRepo.save(newEntity);

			// Step 2: Check if cap or label already exists with serStatus=SUCCESS
			Optional<BpclPrimaryCapLabelVerify> existingByCap = primaryVerifyRepo.findByCapQrCodeAndSerStatus(capCode,
					"SUCCESS");
			Optional<BpclPrimaryCapLabelVerify> existingByLabel = primaryVerifyRepo
					.findByLabelCodeAndSerStatus(labelCode, "SUCCESS");

			/*
			 * Optional<BpclPrimaryCapLabelVerify> existingByLabel = Optional.empty(); if
			 * (existingByCap.isEmpty()) { existingByLabel =
			 * primaryVerifyRepo.findByLabelCodeAndSerStatus(labelCode, "SUCCESS"); }
			 */

			if (existingByCap.isPresent() || existingByLabel.isPresent()) {
				savedEntity.setSerStatus("FAIL");
				savedEntity.setLastModifiedBy("1");
				savedEntity.setLastModifiedOn(LocalDateTime.now());
				primaryVerifyRepo.save(savedEntity);

				log.warn("Duplicate cap or label with SUCCESS found → Marked new record as FAIL.");
				break;
			}

			// Step 3: Check if cap exists
			Optional<BpclCapCouponDetails> existingCapOpt = capCouponRepo.findBycapQrCode(capCode);
			if (existingCapOpt.isEmpty()) {
				// Cap not found → mark as FAIL and return
				savedEntity.setSerStatus("FAIL");
				savedEntity.setLastModifiedBy("1");
				savedEntity.setLastModifiedOn(LocalDateTime.now());
				primaryVerifyRepo.save(savedEntity);

				log.warn("Cap QR Code not found in cap-coupon table → Marked verify as FAIL. Cap: {}", capCode);
				break;
			}

			// Step 4: Update cap-coupon record
			BpclCapCouponDetails existingCap = existingCapOpt.get();
			existingCap.setStatus("4");
			existingCap.setMrpBatchNo(data.getMrpBatchNo());
			existingCap.setBatchNo(data.getBatchNo());
			existingCap.setPlanId((long) data.getPlanId());
			existingCap.setLastModifiedBy("1");
			existingCap.setLastModifiedOn(LocalDateTime.now());
			existingCap.setAggregatedOn(data.getAggregatedOn());
			existingCap.setProdCode(data.getProdCode());
			existingCap.setProdName(data.getProdName());

			capCouponRepo.save(existingCap);
			log.info("Updated Cap-Coupon record for Cap: {}", capCode);

			// Step 5: Insert or update label only if cap exists
			Optional<BpclLabelRegister> existingLabelOpt = labelregisterrepo.findById(labelCode);

			if (existingLabelOpt.isPresent()) {
				BpclLabelRegister existingLabel = existingLabelOpt.get();
				existingLabel.setBatchNo(data.getBatchNo());
				existingLabel.setLineNo(data.getLineNo());
				existingLabel.setStatus("4");
				existingLabel.setCouponNo(existingCap.getCouponQrCode());
				existingLabel.setLastModifiedBy("1");
				existingLabel.setLastModifiedOn(LocalDateTime.now());

				labelregisterrepo.save(existingLabel);
				log.info("Updated existing Label Register: {}", labelCode);
			} else {
				BpclLabelRegister newLabel = new BpclLabelRegister();
				newLabel.setLabelCode(labelCode);
				newLabel.setProdCode(data.getProdCode());
				newLabel.setProdName(data.getProdName());
				newLabel.setProdSize(data.getProdSize());
				newLabel.setPackType(data.getPackType());
				newLabel.setBatchNo(data.getBatchNo());
				newLabel.setLineNo(data.getLineNo());
				newLabel.setCurrLocCode(String.valueOf(data.getLocCode()));
				newLabel.setStatus("4");
				newLabel.setCreatedBy(1);
				newLabel.setCreatedOn(LocalDateTime.now());
				newLabel.setLastModifiedBy("1");
				newLabel.setLastModifiedOn(LocalDateTime.now());
				newLabel.setCouponNo(existingCap.getCouponQrCode());

				labelregisterrepo.save(newLabel);
				log.info("Inserted new Label Register: {}", labelCode);
			}

			// Step 6: Mark verify record as SUCCESS
			savedEntity.setSerStatus("SUCCESS");
			savedEntity.setLastModifiedBy("1");
			savedEntity.setLastModifiedOn(LocalDateTime.now());
			primaryVerifyRepo.save(savedEntity);

			log.info("Verification complete → Marked new record as SUCCESS. Cap: {}, Label: {}", capCode, labelCode);
			break;

		default:
			log.warn("Unknown CB status: {} → Skipping processing.", cbStatus);
			break;
		}
	}
}
