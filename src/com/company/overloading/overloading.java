package com.company.overloading;

public class overloading {
    public static void main(String[] args){
        number(3);
        number(3.5);
    }

    public static void number(int a){
        System.out.println("day la so nguyen");
    }

    public static void number(double a){
        System.out.println("day la so thuc");
    }
}
