package com.igeek.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Maintain {
    private Integer maintainno;

    private String applicant;

    private Date applicationdate;

    private String theme;

    private String carbrand;

    private Integer type;

    private String maintenancecompany;

    private BigDecimal cost;

    private String chargeperson;

    private Date startmaintaindate;

    private Date endmaintaindate;

    private String content;

    private String remarks;

    private String enclosure;

    private String filename;

    public Integer getMaintainno() {
        return maintainno;
    }

    public void setMaintainno(Integer maintainno) {
        this.maintainno = maintainno;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMaintenancecompany() {
        return maintenancecompany;
    }

    public void setMaintenancecompany(String maintenancecompany) {
        this.maintenancecompany = maintenancecompany == null ? null : maintenancecompany.trim();
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

    public Date getStartmaintaindate() {
        return startmaintaindate;
    }

    public void setStartmaintaindate(Date startmaintaindate) {
        this.startmaintaindate = startmaintaindate;
    }

    public Date getEndmaintaindate() {
        return endmaintaindate;
    }

    public void setEndmaintaindate(Date endmaintaindate) {
        this.endmaintaindate = endmaintaindate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        return "Maintain{" +
                "maintainno=" + maintainno +
                ", applicant='" + applicant + '\'' +
                ", applicationdate=" + applicationdate +
                ", theme='" + theme + '\'' +
                ", carbrand='" + carbrand + '\'' +
                ", type=" + type +
                ", maintenancecompany='" + maintenancecompany + '\'' +
                ", cost=" + cost +
                ", chargeperson='" + chargeperson + '\'' +
                ", startmaintaindate=" + startmaintaindate +
                ", endmaintaindate=" + endmaintaindate +
                ", content='" + content + '\'' +
                ", remarks='" + remarks + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }
}