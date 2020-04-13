package com.igeek.pojo;

import java.util.Date;

public class Carapplication {
    private Integer applicationno;

    private String applicant;

    private Date applicationdate;

    private Integer selfdriving;

    private String passenger;

    private Integer passengernumber;

    private Date departuretime;

    private Date returntime;

    private String reasons;

    private String remarks;

    private Integer designatedvehicle;

    private String driverinformation;

    private String timeandplace;

    private String actualinformation;

    private String fuel;

    private Integer cost;

    public Integer getApplicationno() {
        return applicationno;
    }

    public void setApplicationno(Integer applicationno) {
        this.applicationno = applicationno;
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

    public Integer getSelfdriving() {
        return selfdriving;
    }

    public void setSelfdriving(Integer selfdriving) {
        this.selfdriving = selfdriving;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger == null ? null : passenger.trim();
    }

    public Integer getPassengernumber() {
        return passengernumber;
    }

    public void setPassengernumber(Integer passengernumber) {
        this.passengernumber = passengernumber;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons == null ? null : reasons.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getDesignatedvehicle() {
        return designatedvehicle;
    }

    public void setDesignatedvehicle(Integer designatedvehicle) {
        this.designatedvehicle = designatedvehicle;
    }

    public String getDriverinformation() {
        return driverinformation;
    }

    public void setDriverinformation(String driverinformation) {
        this.driverinformation = driverinformation == null ? null : driverinformation.trim();
    }

    public String getTimeandplace() {
        return timeandplace;
    }

    public void setTimeandplace(String timeandplace) {
        this.timeandplace = timeandplace == null ? null : timeandplace.trim();
    }

    public String getActualinformation() {
        return actualinformation;
    }

    public void setActualinformation(String actualinformation) {
        this.actualinformation = actualinformation == null ? null : actualinformation.trim();
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel == null ? null : fuel.trim();
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Carapplication{" +
                "applicationno=" + applicationno +
                ", applicant='" + applicant + '\'' +
                ", applicationdate=" + applicationdate +
                ", selfdriving=" + selfdriving +
                ", passenger='" + passenger + '\'' +
                ", passengernumber=" + passengernumber +
                ", departuretime=" + departuretime +
                ", returntime=" + returntime +
                ", reasons='" + reasons + '\'' +
                ", remarks='" + remarks + '\'' +
                ", designatedvehicle=" + designatedvehicle +
                ", driverinformation='" + driverinformation + '\'' +
                ", timeandplace='" + timeandplace + '\'' +
                ", actualinformation='" + actualinformation + '\'' +
                ", fuel='" + fuel + '\'' +
                ", cost=" + cost +
                '}';
    }
}