package com.company.RealEstateCompany;

public class CLandTrans extends CRealEstate {
    private CType type;

    public CLandTrans() {
    }

    public CLandTrans(String code, CDate date, long unitPrice, CType type, int  area) {
        super(code, date, unitPrice, area);
        this.type = type;
    }

    public long totalPayment() {
        long totalPayment = this.type.payment(this.unitPrice, this.area);
        return totalPayment;
    }

    public String toString(){
       return "[ban dat]" + " ma: " + this.code + ", ngay: " + this.date + ", don gia: " + this.unitPrice + ", loai: " + this.type.toString() + ", dien tich: " + this.area;
    }
}
