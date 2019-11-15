package com.company.cstatic;

public class CHonda {
    private String name;
    private int price;
    private int capacity;

    static String brand = "Honda";

    public CHonda(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public CHonda(String name, int price, int capacity){
        this(name, price);
        this.capacity = capacity;
    }

    public static void change(){
        brand = "yamaha";
    }

    public void info(){
        System.out.println("ten xe: " + this.name + ", gia xe: " + ", hang xe: " + brand + capacity);
    }
}
