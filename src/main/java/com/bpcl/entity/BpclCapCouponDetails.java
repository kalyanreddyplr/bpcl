package com.bpcl.entity;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "bpcl_cap_coupondetails", schema = "public")

public class BpclCapCouponDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "status", length = 5)
    private String status;

    @Column(name = "pack_type", length = 50)
    private String packType;

    @Column(name = "lot_number", length = 50)
    private String lotNumber;

    @Column(name = "cap_qr_code", length = 50)
    private String capQrCode;

    @Column(name = "coupon_qr_code", length = 50)
    private String couponQrCode;

    @Column(name = "aggregated_on")
    private LocalDateTime aggregatedOn;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "created_by", length = 5)
    private String createdBy;

    @Column(name = "last_modified_on")
    private LocalDateTime lastModifiedOn;

    @Column(name = "last_modified_by", length = 5)
    private String lastModifiedBy;

    @Column(name = "loc_code", length = 8)
    private String locCode;

    @Column(name = "plan_id")
    private Long planId;

    @Column(name = "line_no", length = 10)
    private String lineNo;

    @Column(name = "batch_no", length = 50)
    private String batchNo;

    @Column(name = "prod_code", length = 15)
    private String prodCode;

    @Column(name = "prod_name", length = 300)
    private String prodName;

    @Column(name = "bottle_capacity", length = 50)
    private String bottleCapacity;

    @Column(name = "mrp_batch_no", length = 20)
    private String mrpBatchNo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPackType() {
		return packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getCapQrCode() {
		return capQrCode;
	}

	public void setCapQrCode(String capQrCode) {
		this.capQrCode = capQrCode;
	}

	public String getCouponQrCode() {
		return couponQrCode;
	}

	public void setCouponQrCode(String couponQrCode) {
		this.couponQrCode = couponQrCode;
	}

	public LocalDateTime getAggregatedOn() {
		return aggregatedOn;
	}

	public void setAggregatedOn(LocalDateTime aggregatedOn) {
		this.aggregatedOn = aggregatedOn;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public String getLocCode() {
		return locCode;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
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

	public String getBottleCapacity() {
		return bottleCapacity;
	}

	public void setBottleCapacity(String bottleCapacity) {
		this.bottleCapacity = bottleCapacity;
	}

	public String getMrpBatchNo() {
		return mrpBatchNo;
	}

	public void setMrpBatchNo(String mrpBatchNo) {
		this.mrpBatchNo = mrpBatchNo;
	}
    
    
}
