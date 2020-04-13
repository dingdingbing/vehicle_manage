package com.igeek.pojo;

import java.util.Date;

public class Car {
    private Integer carno;

    private String carname;

    private String carbrand;

    private String carspecs;

    private String fuel;

    private Integer price;

    private String color;

    private String manufacturer;

    private String supplier;

    private Date productiondate;

    private Date purchasedate;

    private String engineno;

    private String frameno;

    private String storage;

    private String manager;

    private Integer status;

    private String additionaldescription;

    private String url;

    private Date nextannualinspectiondate;

    private Date insurancedeadline;

    private Date lastservicedate;

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

    public String getCarspecs() {
        return carspecs;
    }

    public void setCarspecs(String carspecs) {
        this.carspecs = carspecs == null ? null : carspecs.trim();
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel == null ? null : fuel.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Date getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(Date productiondate) {
        this.productiondate = productiondate;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno == null ? null : engineno.trim();
    }

    public String getFrameno() {
        return frameno;
    }

    public void setFrameno(String frameno) {
        this.frameno = frameno == null ? null : frameno.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAdditionaldescription() {
        return additionaldescription;
    }

    public void setAdditionaldescription(String additionaldescription) {
        this.additionaldescription = additionaldescription == null ? null : additionaldescription.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getNextannualinspectiondate() {
        return nextannualinspectiondate;
    }

    public void setNextannualinspectiondate(Date nextannualinspectiondate) {
        this.nextannualinspectiondate = nextannualinspectiondate;
    }

    public Date getInsurancedeadline() {
        return insurancedeadline;
    }

    public void setInsurancedeadline(Date insurancedeadline) {
        this.insurancedeadline = insurancedeadline;
    }

    public Date getLastservicedate() {
        return lastservicedate;
    }

    public void setLastservicedate(Date lastservicedate) {
        this.lastservicedate = lastservicedate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carno=" + carno +
                ", carname='" + carname + '\'' +
                ", carbrand='" + carbrand + '\'' +
                ", carspecs='" + carspecs + '\'' +
                ", fuel='" + fuel + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", supplier='" + supplier + '\'' +
                ", productiondate=" + productiondate +
                ", purchasedate=" + purchasedate +
                ", engineno='" + engineno + '\'' +
                ", frameno='" + frameno + '\'' +
                ", storage='" + storage + '\'' +
                ", manager='" + manager + '\'' +
                ", status=" + status +
                ", additionaldescription='" + additionaldescription + '\'' +
                ", url='" + url + '\'' +
                ", nextannualinspectiondate=" + nextannualinspectiondate +
                ", insurancedeadline=" + insurancedeadline +
                ", lastservicedate=" + lastservicedate +
                '}';
    }
}