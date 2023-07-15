package com.emrullahyz.resourceserver;

public class TollData {
    private String recordId;
    private String licencePlate;
    private String timestamp;

    public TollData() {
    }

    public TollData(String recordId, String licencePlate, String timestamp) {
        this.recordId = recordId;
        this.licencePlate = licencePlate;
        this.timestamp = timestamp;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
