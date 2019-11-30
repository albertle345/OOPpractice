package com.company.ElectricBill;

public class CCustomer {
    protected String code;
    protected String fullName;
    protected CDate date;
    protected int amount;
    protected long unitPrice;// don gia

    public CCustomer(String code, String fullName, CDate date, int amount, long unitPrice) {
        this.code = code;
        this.fullName = fullName;
        this.date = date;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public CDate getDate() {
        return date;
    }

    public void setDate(CDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }

}
