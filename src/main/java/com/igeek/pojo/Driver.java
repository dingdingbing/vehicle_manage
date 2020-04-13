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
                '}';
    }
}