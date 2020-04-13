package com.igeek.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Accident {
    private Integer accidentno;

    private String driver;

    private String carbrand;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accidenttime;

    private String accidentplace;

    private String accidentdetails;

    private String responsibility;

    private String maintenancefactory;

    private Date repairdate;

    private Date repairenddate;

    private BigDecimal damagefee;

    private BigDecimal insuranceclaimamount;

    private BigDecimal driverborneamount;

    private BigDecimal maintenancecosts;

    private String maintenancecontents;

    private String enclosure;

    private String filename;

    public Integer getAccidentno() {
        return accidentno;
    }

    public void setAccidentno(Integer accidentno) {
        this.accidentno = accidentno;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public Date getAccidenttime() {
        return accidenttime;
    }

    public void setAccidenttime(Date accidenttime) {
        this.accidenttime = accidenttime;
    }

    public String getAccidentplace() {
        return accidentplace;
    }

    public void setAccidentplace(String accidentplace) {
        this.accidentplace = accidentplace == null ? null : accidentplace.trim();
    }

    public String getAccidentdetails() {
        return accidentdetails;
    }

    public void setAccidentdetails(String accidentdetails) {
        this.accidentdetails = accidentdetails == null ? null : accidentdetails.trim();
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility == null ? null : responsibility.trim();
    }

    public String getMaintenancefactory() {
        return maintenancefactory;
    }

    public void setMaintenancefactory(String maintenancefactory) {
        this.maintenancefactory = maintenancefactory == null ? null : maintenancefactory.trim();
    }

    public Date getRepairdate() {
        return repairdate;
    }

    public void setRepairdate(Date repairdate) {
        this.repairdate = repairdate;
    }

    public Date getRepairenddate() {
        return repairenddate;
    }

    public void setRepairenddate(Date repairenddate) {
        this.repairenddate = repairenddate;
    }

    public BigDecimal getDamagefee() {
        return damagefee;
    }

    public void setDamagefee(BigDecimal damagefee) {
        this.damagefee = damagefee;
    }

    public BigDecimal getInsuranceclaimamount() {
        return insuranceclaimamount;
    }

    public void setInsuranceclaimamount(BigDecimal insuranceclaimamount) {
        this.insuranceclaimamount = insuranceclaimamount;
    }

    public BigDecimal getDriverborneamount() {
        return driverborneamount;
    }

    public void setDriverborneamount(BigDecimal driverborneamount) {
        this.driverborneamount = driverborneamount;
    }

    public BigDecimal getMaintenancecosts() {
        return maintenancecosts;
    }

    public void setMaintenancecosts(BigDecimal maintenancecosts) {
        this.maintenancecosts = maintenancecosts;
    }

    public String getMaintenancecontents() {
        return maintenancecontents;
    }

    public void setMaintenancecontents(String maintenancecontents) {
        this.maintenancecontents = maintenancecontents == null ? null : maintenancecontents.trim();
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
        return "Accident{" +
                "accidentno=" + accidentno +
                ", driver='" + driver + '\'' +
                ", carbrand='" + carbrand + '\'' +
                ", accidenttime=" + accidenttime +
                ", accidentplace='" + accidentplace + '\'' +
                ", accidentdetails='" + accidentdetails + '\'' +
                ", responsibility='" + responsibility + '\'' +
                ", maintenancefactory='" + maintenancefactory + '\'' +
                ", repairdate=" + repairdate +
                ", repairenddate=" + repairenddate +
                ", damagefee=" + damagefee +
                ", insuranceclaimamount=" + insuranceclaimamount +
                ", driverborneamount=" + driverborneamount +
                ", maintenancecosts=" + maintenancecosts +
                ", maintenancecontents='" + maintenancecontents + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }
}