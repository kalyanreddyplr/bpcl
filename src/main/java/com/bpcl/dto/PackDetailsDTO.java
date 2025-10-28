package com.bpcl.dto;

public class PackDetailsDTO {
	
	
	private String capCode;
	
	private String labelCode;

	public String getCapCode() {
		return capCode;
	}

	public void setCapCode(String capCode) {
		this.capCode = capCode;
	}

	public String getLabelCode() {
		return labelCode;
	}

	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	@Override
	public String toString() {
		return "PackDetailsDTO [capCode=" + capCode + ", labelCode=" + labelCode + ", getCapCode()=" + getCapCode()
				+ ", getLabelCode()=" + getLabelCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
