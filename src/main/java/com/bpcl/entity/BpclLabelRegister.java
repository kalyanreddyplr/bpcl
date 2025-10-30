package com.bpcl.entity;

import jakarta.persistence.
*;


import java.time.LocalDateTime;

@Entity
@Table(name = "bpcl_label_register", schema = "public")
public class BpclLabelRegister {

    @Id
    @Column(name = "label_code", length = 100)
    private String labelCode;

    @Column(name = "prod_code", length = 100)
    private String prodCode;

    @Column(name = "prod_name", length = 300)
    private String prodName;

    @Column(name = "prod_size", length = 100)
    private String prodSize;

    @Column(name = "pack_type", length = 50)
    private String packType;

    @Column(name = "supp_code")
    private Long suppCode;

    @Column(name = "batch_no", length = 100)
    private String batchNo;

    @Column(name = "coupon_no", length = 100)
    private String couponNo;

    @Column(name = "spool_barcode", length = 200)
    private String spoolBarcode;

    @Column(name = "mfg_date")
    private LocalDateTime mfgDate;

    @Column(name = "disposal_date")
    private LocalDateTime disposalDate;

    @Column(name = "mrp", length = 200)
    private String mrp;

    @Column(name = "expiry_date")
    private LocalDateTime expiryDate;

    @Column(name = "mfg_loc_code", length = 8)
    private String mfgLocCode;

    @Column(name = "depot_loc_code", length = 8)
    private String depotLocCode;

    @Column(name = "curr_loc_code", length = 8)
    private String currLocCode;

    @Column(name = "case_barcode", length = 100)
    private String caseBarcode;

    @Column(name = "prev_case_barcode", length = 100)
    private String prevCaseBarcode;

    @Column(name = "mfg_name", length = 200)
    private String mfgName;

    @Column(name = "depot_name", length = 200)
    private String depotName;

    @Column(name = "vend_loc_code", length = 8)
    private String vendLocCode;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "status", length = 3)
    private String status;

    @Column(name = "line_no", length = 100)
    private String lineNo;

    @Column(name = "distributor_loc_code", length = 8)
    private String distributorLocCode;

    @Column(name = "distributor_name", length = 200)
    private String distributorName;

    @Column(name = "mechanic_loc_code", length = 8)
    private String mechanicLocCode;

    @Column(name = "mechanic_loc_name", length = 200)
    private String mechanicLocName;

    @Column(name = "vendor_loc_name", length = 200)
    private String vendorLocName;

    @Column(name = "mrp_batch", length = 50)
    private String mrpBatch;

    @Column(name = "web_status", length = 10)
    private String webStatus;

    @Column(name = "forum_id", length = 20)
    private String forumId;

    @Column(name = "loyalty_latitude", length = 50)
    private String loyaltyLatitude;

    @Column(name = "loyalty_longitude", length = 50)
    private String loyaltyLongitude;

    @Column(name = "mobile_no", length = 20)
    private String mobileNo;

    @Column(name = "loyalty_scan_time")
    private LocalDateTime loyaltyScanTime;

    @Column(name = "persona_name", length = 100)
    private String personaName;

    @Column(name = "tp_label_invy_call", length = 3)
    private String tpLabelInvyCall;

    @Column(name = "last_modified_on")
    private LocalDateTime lastModifiedOn;

    @Column(name = "last_modified_by", length = 50)
    private String lastModifiedBy;

    @Column(name = "cap_qr_code", length = 50)
    private String capQrCode;

    @Column(name = "coupon_type")
    private Integer couponType;

	public String getLabelCode() {
		return labelCode;
	}

	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdSize() {
		return prodSize;
	}

	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public Long getSuppCode() {
		return suppCode;
	}

	public void setSuppCode(Long suppCode) {
		this.suppCode = suppCode;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getSpoolBarcode() {
		return spoolBarcode;
	}

	public void setSpoolBarcode(String spoolBarcode) {
		this.spoolBarcode = spoolBarcode;
	}

	public LocalDateTime getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDateTime mfgDate) {
		this.mfgDate = mfgDate;
	}

	public LocalDateTime getDisposalDate() {
		return disposalDate;
	}

	public void setDisposalDate(LocalDateTime disposalDate) {
		this.disposalDate = disposalDate;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getMfgLocCode() {
		return mfgLocCode;
	}

	public void setMfgLocCode(String mfgLocCode) {
		this.mfgLocCode = mfgLocCode;
	}

	public String getDepotLocCode() {
		return depotLocCode;
	}

	public void setDepotLocCode(String depotLocCode) {
		this.depotLocCode = depotLocCode;
	}

	public String getCurrLocCode() {
		return currLocCode;
	}

	public void setCurrLocCode(String currLocCode) {
		this.currLocCode = currLocCode;
	}

	public String getCaseBarcode() {
		return caseBarcode;
	}

	public void setCaseBarcode(String caseBarcode) {
		this.caseBarcode = caseBarcode;
	}

	public String getPrevCaseBarcode() {
		return prevCaseBarcode;
	}

	public void setPrevCaseBarcode(String prevCaseBarcode) {
		this.prevCaseBarcode = prevCaseBarcode;
	}

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}

	public String getDepotName() {
		return depotName;
	}

	public void setDepotName(String depotName) {
		this.depotName = depotName;
	}

	public String getVendLocCode() {
		return vendLocCode;
	}

	public void setVendLocCode(String vendLocCode) {
		this.vendLocCode = vendLocCode;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getDistributorLocCode() {
		return distributorLocCode;
	}

	public void setDistributorLocCode(String distributorLocCode) {
		this.distributorLocCode = distributorLocCode;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getMechanicLocCode() {
		return mechanicLocCode;
	}

	public void setMechanicLocCode(String mechanicLocCode) {
		this.mechanicLocCode = mechanicLocCode;
	}

	public String getMechanicLocName() {
		return mechanicLocName;
	}

	public void setMechanicLocName(String mechanicLocName) {
		this.mechanicLocName = mechanicLocName;
	}

	public String getVendorLocName() {
		return vendorLocName;
	}

	public void setVendorLocName(String vendorLocName) {
		this.vendorLocName = vendorLocName;
	}

	public String getMrpBatch() {
		return mrpBatch;
	}

	public void setMrpBatch(String mrpBatch) {
		this.mrpBatch = mrpBatch;
	}

	public String getWebStatus() {
		return webStatus;
	}

	public void setWebStatus(String webStatus) {
		this.webStatus = webStatus;
	}

	public String getForumId() {
		return forumId;
	}

	public void setForumId(String forumId) {
		this.forumId = forumId;
	}

	public String getLoyaltyLatitude() {
		return loyaltyLatitude;
	}

	public void setLoyaltyLatitude(String loyaltyLatitude) {
		this.loyaltyLatitude = loyaltyLatitude;
	}

	public String getLoyaltyLongitude() {
		return loyaltyLongitude;
	}

	public void setLoyaltyLongitude(String loyaltyLongitude) {
		this.loyaltyLongitude = loyaltyLongitude;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDateTime getLoyaltyScanTime() {
		return loyaltyScanTime;
	}

	public void setLoyaltyScanTime(LocalDateTime loyaltyScanTime) {
		this.loyaltyScanTime = loyaltyScanTime;
	}

	public String getPersonaName() {
		return personaName;
	}

	public void setPersonaName(String personaName) {
		this.personaName = personaName;
	}

	public String getTpLabelInvyCall() {
		return tpLabelInvyCall;
	}

	public void setTpLabelInvyCall(String tpLabelInvyCall) {
		this.tpLabelInvyCall = tpLabelInvyCall;
	}

	public LocalDateTime getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(LocalDateTime lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getCapQrCode() {
		return capQrCode;
	}

	public void setCapQrCode(String capQrCode) {
		this.capQrCode = capQrCode;
	}

	public Integer getCouponType() {
		return couponType;
	}

	public void setCouponType(Integer couponType) {
		this.couponType = couponType;
	}
    
    
    
}
