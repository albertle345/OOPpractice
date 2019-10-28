package com.company;

import com.company.shape.CCircle;
import com.company.shape.CPoint2D;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        CCircle cCircle = new CCircle();
//        cCircle.init(2, 5, 3);
//        cCircle.info();

        CPoint2D cPoint2D = new CPoint2D();
        cPoint2D.setX(6);
        cPoint2D.setY(7);
        String info = cPoint2D.getInfo();
        System.out.println(info);

        double x = cPoint2D.getX();
        System.out.println(x);
    }
}
