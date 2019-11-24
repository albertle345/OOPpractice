package com.company.Library;

public class CDocument extends CBook{
    public double tax;

    public CDocument(String code, CDate date, long price, int quantity, String publisher, double tax) {
        super(code, date, price, quantity, publisher);
        this.tax = tax;
    }

    public long totalPrice(){
        long totalPrice = 0;
        totalPrice = (long) (this.quantity * (this.price + this.tax));
        return totalPrice;
    }

    public String toString(){
        return "ma sach: " + this.code + ", ngay nhap: " + this.date + ", gia: " + this.price + ", so luong: " + this.quantity + ", NXB: " + this.publisher;
    }
}
