package com.company.heritage.shape;

import java.util.Scanner;

public class CElipse extends CShape {
    protected int radiusA;
    protected int radiusB;

    final double PI = 3.1412;

    public CElipse(int radiusA, int radiusB) {
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }


    @Override
    void input(Scanner read) {
        System.out.println("nhap ban kinh 1: ");
        this.radiusA = read.nextInt();
        System.out.println("nhap ban kinh 2: ");
        this.radiusB = read.nextInt();

    }

    @Override
    double area() {
        double area = PI * this.radiusA * this.radiusB;
        return area;
    }

    public String toString(){
        double area = area();
        return "ban kinh 1 la: " + String.valueOf(this.radiusA) +" ban kinh 2 la: "+ String.valueOf(this.radiusB) + " dien tich la: " + String.valueOf(area);
    }

}
