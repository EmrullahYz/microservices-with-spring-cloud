package com.emrullahyz.webfunction;

public class TollRecord {
    private String stationId;
    private String licencePlate;
    private String timstamp;

    public TollRecord(String stationId, String licencePlate, String timstamp) {
        this.stationId = stationId;
        this.licencePlate = licencePlate;
        this.timstamp = timstamp;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getTimstamp() {
        return timstamp;
    }

    public void setTimstamp(String timstamp) {
        this.timstamp = timstamp;
    }

}
