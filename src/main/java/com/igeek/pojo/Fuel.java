package com.igeek.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Fuel {
    private Integer registrationnumber;

    private String applicant;

    private Date applicationdate;

    private String carbrand;

    private Date refuelingdate;

    private BigDecimal refuelingcapacity;

    private BigDecimal fuelamount;

    private String chargeperson;

    private String remarks;

    private String voucher;

    public Integer getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(Integer registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public Date getApplicationdate() {
        return applicationdate;
    }

    public void setApplicationdate(Date applicationdate) {
        this.applicationdate = applicationdate;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public Date getRefuelingdate() {
        return refuelingdate;
    }

    public void setRefuelingdate(Date refuelingdate) {
        this.refuelingdate = refuelingdate;
    }

    public BigDecimal getRefuelingcapacity() {
        return refuelingcapacity;
    }

    public void setRefuelingcapacity(BigDecimal refuelingcapacity) {
        this.refuelingcapacity = refuelingcapacity;
    }

    public BigDecimal getFuelamount() {
        return fuelamount;
    }

    public void setFuelamount(BigDecimal fuelamount) {
        this.fuelamount = fuelamount;
    }

    public String getChargeperson() {
        return chargeperson;
    }

    public void setChargeperson(String chargeperson) {
        this.chargeperson = chargeperson == null ? null : chargeperson.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher == null ? null : voucher.trim();
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "registrationnumber=" + registrationnumber +
                ", applicant='" + applicant + '\'' +
                ", applicationdate=" + applicationdate +
                ", carbrand='" + carbrand + '\'' +
                ", refuelingdate=" + refuelingdate +
                ", refuelingcapacity=" + refuelingcapacity +
                ", fuelamount=" + fuelamount +
                ", chargeperson='" + chargeperson + '\'' +
                ", remarks='" + remarks + '\'' +
                ", voucher='" + voucher + '\'' +
                '}';
    }
}