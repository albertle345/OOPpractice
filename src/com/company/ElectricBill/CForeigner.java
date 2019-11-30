package com.company.ElectricBill;

public class CForeigner extends CCustomer {
    private String nationality;

    public CForeigner(String code, String fullName, CDate date, String nationality, int amount, long unitPrice) {
        super(code, fullName, date, amount, unitPrice);
        this.nationality = nationality;
    }

    public String toString(){
        return "[khach nuoc ngoai] " + "ma: " + this.code + ", ten: " + this.fullName + ", ngay: " + this.date + ", quoc tich: " + this.nationality + ", so luong: " + this.amount + ", don gia: " + this.unitPrice ;
    }

    public long totalPayment(){
        return this.amount * this.unitPrice;
    }

}
