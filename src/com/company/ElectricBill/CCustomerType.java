package com.company.ElectricBill;

public class CCustomerType {
    private String living;
    private String business;
    private String manufacture;

    public CCustomerType(String living, String business, String manufacture) {
        this.living = living;
        this.business = business;
        this.manufacture = manufacture;
    }

    public String getLiving() {
        return living;
    }

    public void setLiving(String living) {
        this.living = living;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String toString(){
        return "{sinh hoat: " + this.living + ", kinh doanh: " + this.business + ", san xuat: " + this.manufacture + "}";
    }
}
