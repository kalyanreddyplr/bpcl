package com.bpcl.repository;

import com.bpcl.entity.BpclPrimaryCapLabelVerify;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BpclPrimaryCapLabelVerifyRepository extends JpaRepository<BpclPrimaryCapLabelVerify, Integer> {



	Optional<BpclPrimaryCapLabelVerify> findByCapQrCodeAndSerStatus(String capCode, String string);

	Optional<BpclPrimaryCapLabelVerify> findByLabelCodeAndSerStatus(String labelCode, String string);


    // You can define custom query methods here if needed, for example:
	/*
	 * BpclPrimaryCapLabelVerify findByCapQrCode(String capQrCode);
	 * 
	 * BpclPrimaryCapLabelVerify findByLabelCode(String labelCode);
	 */

    // You can also add methods like:
    // List<BpclPrimaryCapLabelVerify> findByCbStatus(String cbStatus);
}
