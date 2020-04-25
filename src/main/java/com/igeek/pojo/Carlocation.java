package com.igeek.pojo;

import java.math.BigDecimal;

public class Carlocation {
    private Integer carno;

    private String carname;

    private String carbrand;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String carphone;

    public Integer getCarno() {
        return carno;
    }

    public void setCarno(Integer carno) {
        this.carno = carno;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname == null ? null : carname.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getCarphone() {
        return carphone;
    }

    public void setCarphone(String carphone) {
        this.carphone = carphone == null ? null : carphone.trim();
    }

    @Override
    public String toString() {
        return "Carlocation{" +
                "carno=" + carno +
                ", carname='" + carname + '\'' +
                ", carbrand='" + carbrand + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", carphone='" + carphone + '\'' +
                '}';
    }
}