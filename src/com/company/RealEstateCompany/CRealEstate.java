package com.company.RealEstateCompany;

public class CRealEstate {
    protected String code;
    protected CDate date;
    protected long unitPrice;
    protected int area;

    public CRealEstate() {
    }

    public CRealEstate(String code, CDate date, long unitPrice, int area) {
        this.code = code;
        this.date = date;
        this.unitPrice = unitPrice;
        this.area = area;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CDate getDate() {
        return date;
    }

    public void setDate(CDate date) {
        this.date = date;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
