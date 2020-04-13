package com.igeek.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Inspection {
    private Integer inspectionno;

    private String applicant;

    private Date applicationdate;

    private String theme;

    private String carbrand;

    private String inspectionplace;

    private String phonenumber;

    private BigDecimal cost;

    private String chargeperson;

    private Date thisinspectiondate;

    private Date nextinspectiondate;

    private String remarks;

    private String enclosure;

    private String filename;

    public Integer getInspectionno() {
        return inspectionno;
    }

    public void setInspectionno(Integer inspectionno) {
        this.inspectionno = inspectionno;
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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public String getInspectionplace() {
        return inspectionplace;
    }

    public void setInspectionplace(String inspectionplace) {
        this.inspectionplace = inspectionplace == null ? null : inspectionplace.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getChargeperson() {
        return chargeperson;
    }

    public void setChargeperson(String chargeperson) {
        this.chargeperson = chargeperson == null ? null : chargeperson.trim();
    }

    public Date getThisinspectiondate() {
        return thisinspectiondate;
    }

    public void setThisinspectiondate(Date thisinspectiondate) {
        this.thisinspectiondate = thisinspectiondate;
    }

    public Date getNextinspectiondate() {
        return nextinspectiondate;
    }

    public void setNextinspectiondate(Date nextinspectiondate) {
        this.nextinspectiondate = nextinspectiondate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure == null ? null : enclosure.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }


    @Override
    public String toString() {
        return "Inspection{" +
                "inspectionno=" + inspectionno +
                ", applicant='" + applicant + '\'' +
                ", applicationdate=" + applicationdate +
                ", theme='" + theme + '\'' +
                ", carbrand='" + carbrand + '\'' +
                ", inspectionplace='" + inspectionplace + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", cost=" + cost +
                ", chargeperson='" + chargeperson + '\'' +
                ", thisinspectiondate=" + thisinspectiondate +
                ", nextinspectiondate=" + nextinspectiondate +
                ", remarks='" + remarks + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }
}