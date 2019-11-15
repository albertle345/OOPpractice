package com.company.heritage.shape;

import java.util.Scanner;

public class CSquare extends CRectangle {

    public CSquare(int size) {
        super(size, size);
    }

    public void input(Scanner read){
        System.out.println("nhap canh hinh vuong");
        int size = read.nextInt();
        this.height = this.width = size;
    }
    public String toString(){
        double area = area();
        return "canh la: " + String.valueOf(this.height) + " dien tich la: " + String.valueOf(area);
    }
}
