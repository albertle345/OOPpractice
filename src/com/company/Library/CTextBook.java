package com.company.Library;

public class CTextBook extends CBook{
    private int status;

    public CTextBook(String code, CDate date, long price, int quantity, String publisher, int status) {
        super(code, date, price, quantity, publisher);
        this.status = status;
    }

    public long totalPrice(){
        long totalPrice = 0;
        if(this.status == 0){
            totalPrice = this.price * this.quantity;
        }
        else {
            totalPrice = (long) (this.price * this.quantity * 0.5);
        }
        return totalPrice;
    }

    public String toString(){
        return "ma sach: " + this.code + ", ngay nhap: " + this.date + ", gia: " + this.price + ", so luong: " + this.quantity + ", NXB: " + this.publisher;
    }



}
