package com.company.heritage.shape;

import java.util.Scanner;

public class CRectangle extends CShape {
    protected int height;
    protected int width;

    public CRectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

//    public double area(){
//        int area = this.height * this.width;
//        return area;
//    }
//
//    public void input(Scanner read){
//        System.out.println("nhap chieu dai:");
//        this.height =  read.nextInt();
//        System.out.println("nhap chieu rong:");
//        this.width = read.nextInt();
//    }

    public String toString(){
        double area = area();
        return "chieu dai laf: " + String.valueOf(this.height) +" chieu rong la: "+ String.valueOf(this.width) + " dien tich la: " + String.valueOf(area);
    }

    @Override
    void input(Scanner read) {
        System.out.println("nhap chieu dai:");
        this.height =  read.nextInt();
        System.out.println("nhap chieu rong:");
        this.width = read.nextInt();
    }

    @Override
    double area() {
        double area = this.height * this.width;
        return area;
    }
}
