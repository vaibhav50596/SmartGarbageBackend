package com.SmartGarbage.model;

public class GarbageModel {
    private Integer HouseId;
    private String HouseAddress;
    private String ZipCode;
    private Integer RecycledQuantity;
    private Integer LandfillQuantity;
    private String Date;

    public void setHouseID(Integer houseID) {
        HouseId = houseID;
    }

    public void setHouseAddress(String houseAddress) {
        HouseAddress = houseAddress;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public void setRecycledQuantity(Integer recycledQuantity) {
        RecycledQuantity = recycledQuantity;
    }

    public void setLandfillQuantity(Integer landfillQuantity) {
        LandfillQuantity = landfillQuantity;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDate() {
        return Date;
    }

    public Integer getHouseID() {
        return HouseId;
    }

    public String getHouseAddress() {
        return HouseAddress;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public Integer getRecycledQuantity() {
        return RecycledQuantity;
    }

    public Integer getLandfillQuantity() {
        return LandfillQuantity;
    }
}
