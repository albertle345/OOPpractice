package com.company.vehicle;

public class CVehicle {
    private int capacity;
    private long price;
    private String owner;
    private String brand;

    public CVehicle(String owner, String brand,int capacity, long price) {
        this.capacity = capacity;
        this.price = price;
        this.owner = owner;
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long totalPrice(){
        long totalPrice = 0;
        if(this.capacity < 100){
            totalPrice = (long)(this.price + (this.price * 0.01));
        }
        if(this.capacity >= 100 && this.capacity <= 200){
            totalPrice = (long)(this.price + (this.price * 0.03));
        }
        if(this.capacity > 200){
            totalPrice = (long)(this.price + (this.price * 0.05));
        }
        return totalPrice;
    }

    public long tax(){
        long tax = 0;
        if(this.capacity < 100){
            tax = (long)(this.price * 0.01);
        }
        if(this.capacity >= 100 && this.capacity <= 200){
            tax = (long)(this.price * 0.03);
        }
        if(this.capacity > 200){
            tax = (long)(this.price * 0.05);
        }
        return tax;
    }

    public String toString(){
        long tax = tax();
        long totalPrice = totalPrice();
        String strInfo = this.owner + "\t\t\t" + this.brand + "\t\t\t" + this.capacity + "\t\t\t" + this.price + "\t\t\t" + tax + "\t\t\t" + totalPrice;
        return strInfo;
    }

}
