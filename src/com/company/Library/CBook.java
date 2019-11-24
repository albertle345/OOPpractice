package com.company.Library;


public class CBook {
    protected String code;
    protected CDate date;
    protected long price;
    protected int quantity;
    protected String publisher;

    public CBook(String code, CDate date, long price, int quantity, String publisher) {
        this.code = code;
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.publisher = publisher;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
