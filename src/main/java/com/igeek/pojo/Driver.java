package com.igeek.pojo;

import java.util.Date;

public class Driver {
    private Integer driverid;

    private String drivername;

    private Integer driverage;

    private String license;

    private Integer drivingage;

    private String assessment;

    private String address;

    private Integer sex;

    private Date birthday;

    private String sfzzm;

    private String sfzfm;

    private String jszzm;

    private String jszfm;

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public Integer getDriverage() {
        return driverage;
    }

    public void setDriverage(Integer driverage) {
        this.driverage = driverage;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public Integer getDrivingage() {
        return drivingage;
    }

    public void setDrivingage(Integer drivingage) {
        this.drivingage = drivingage;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment == null ? null : assessment.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSfzzm() {
        return sfzzm;
    }

    public void setSfzzm(String sfzzm) {
        this.sfzzm = sfzzm == null ? null : sfzzm.trim();
    }

    public String getSfzfm() {
        return sfzfm;
    }

    public void setSfzfm(String sfzfm) {
        this.sfzfm = sfzfm == null ? null : sfzfm.trim();
    }

    public String getJszzm() {
        return jszzm;
    }

    public void setJszzm(String jszzm) {
        this.jszzm = jszzm == null ? null : jszzm.trim();
    }

    public String getJszfm() {
        return jszfm;
    }

    public void setJszfm(String jszfm) {
        this.jszfm = jszfm == null ? null : jszfm.trim();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverid=" + driverid +
                ", drivername='" + drivername + '\'' +
                ", driverage=" + driverage +
                ", license='" + license + '\'' +
                ", drivingage=" + drivingage +
                ", assessment='" + assessment + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", sfzzm='" + sfzzm + '\'' +
                ", sfzfm='" + sfzfm + '\'' +
                ", jszzm='" + jszzm + '\'' +
                ", jszfm='" + jszfm + '\'' +
                '}';
    }
}