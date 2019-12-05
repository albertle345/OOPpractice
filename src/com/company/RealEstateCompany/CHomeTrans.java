package com.company.RealEstateCompany;

public class CHomeTrans extends CRealEstate {
    private int type;
    private String address;

    public CHomeTrans(String code, CDate date, long unitPrice, int type, String address, int area) {
        super(code, date, unitPrice, area);
        this.type = type;
        this.address = address;
    }

    public long totalPayment(){
        long totalPayment = 0;
        if(this.type == 1){
            totalPayment = this.unitPrice * this.area;
        }
        else if(this.type == 0){
            totalPayment =(long) (this.unitPrice * this.area * 0.9);
        }
        return totalPayment;
    }
    public String toString(){
        return "[ban nha]" + " ma: " + this.code + ", ngay: " + this.date + ", don gia: " + this.unitPrice + ", loai: " + this.type + "dia chi: " + this.address+ ", dien tich: " + this.area;
    }
}
