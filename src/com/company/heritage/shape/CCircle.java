package com.company.heritage.shape;

import java.util.Scanner;

public class CCircle extends CElipse {
    public CCircle(int radius) {
        super(radius, radius);
    }

    public void input(Scanner read){
        System.out.println("nhap ban kinh: ");
        this.radiusA = this.radiusB = read.nextInt();
    }
    public String toString(){
        double area = area();
        return "ban kinh la: " + String.valueOf(this.radiusA) + " dien tich la: " + String.valueOf(area);
    }

}
