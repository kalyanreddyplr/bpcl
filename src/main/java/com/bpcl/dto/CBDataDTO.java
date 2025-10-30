package com.bpcl.dto;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

public class CBDataDTO {


	private int planId;

	private int locCode;

	private String lineNo;

	private String batchNo;

	private String prodCode;

	private String prodName;

	private String prodSize;

	private String packType;

	private String mrpBatchNo;

	private LocalDateTime aggregatedOn;

	public int getPlanId() {
		return planId;
	}

	@Override
	public String toString() {
		return "CBDataDTO [planId=" + planId + ", locCode=" + locCode + ", lineNo=" + lineNo + ", batchNo=" + batchNo
				+ ", prodCode=" + prodCode + ", prodName=" + prodName + ", prodSize=" + prodSize + ", packType="
				+ packType + ", mrpBatchNo=" + mrpBatchNo + ", aggregatedOn=" + aggregatedOn + ", couponStatus="
				+ couponStatus + ", status=" + status + ", packDetails=" + packDetails + "]";
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getLocCode() {
		return locCode;
	}

	public void setLocCode(int locCode) {
		this.locCode = locCode;
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

	public String getMrpBatchNo() {
		return mrpBatchNo;
	}

	public void setMrpBatchNo(String mrpBatchNo) {
		this.mrpBatchNo = mrpBatchNo;
	}

	public LocalDateTime getAggregatedOn() {
		return aggregatedOn;
	}

	public void setAggregatedOn(LocalDateTime aggregatedOn) {
		this.aggregatedOn = aggregatedOn;
	}

	public String getCouponStatus() {
		return couponStatus;
	}

	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PackDetailsDTO> getPackDetails() {
		return packDetails;
	}

	public void setPackDetails(List<PackDetailsDTO> packDetails) {
		this.packDetails = packDetails;
	}

	private String couponStatus;

	private String status;

	private List<PackDetailsDTO> packDetails;


}
