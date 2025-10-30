package com.bpcl.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bpcl_primary_cap_label_verify", schema = "public")
public class BpclPrimaryCapLabelVerify {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cap_qr_code", length = 50)
    private String capQrCode;

    @Column(name = "label_code", length = 50)
    private String labelCode;

    @Column(name = "cb_status", length = 20)
    private String cbStatus;

    @Column(name = "ser_status", length = 20)
    private String serStatus;

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

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCapQrCode() {
        return capQrCode;
    }

    public void setCapQrCode(String capQrCode) {
        this.capQrCode = capQrCode;
    }

    public String getLabelCode() {
        return labelCode;
    }

    public void setLabelCode(String labelCode) {
        this.labelCode = labelCode;
    }

    public String getCbStatus() {
        return cbStatus;
    }

    public void setCbStatus(String cbStatus) {
        this.cbStatus = cbStatus;
    }

    public String getSerStatus() {
        return serStatus;
    }

    public void setSerStatus(String serStatus) {
        this.serStatus = serStatus;
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
}
