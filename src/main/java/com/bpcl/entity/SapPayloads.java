package com.bpcl.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="bpcl_sap_payloads")
public class SapPayloads {
	
	
	@Id
	private int id;
	
	private String apiName;
	
	private String apiUrl;
	
	private String apiDate;
	
	private LocalDateTime  created_on;
	
	private int CreatedOn;
	
	
	

	public int getId() {
		return id;
	}

	public LocalDateTime getCreated_on() {
		return created_on;
	}

	public void setCreated_on(LocalDateTime created_on) {
		this.created_on = created_on;
	}

	public int getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(int createdOn) {
		CreatedOn = createdOn;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getApiDate() {
		return apiDate;
	}

	public void setApiDate(String apiDate) {
		this.apiDate = apiDate;
	}
	
	
	
	
	

}
