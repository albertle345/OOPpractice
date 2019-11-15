package com.company.heritage.shape;

public class HeritageMain {
    public static void main(String args[]){
        CRectangle rectangle = new CRectangle(7, 3);
        System.out.println(rectangle.toString());

        CSquare square = new CSquare(4);
        System.out.println(square.toString());

        CElipse elipse = new CElipse(3, 4);
        System.out.println(elipse.toString());
        CCircle circle = new CCircle(3);
        System.out.println(circle.toString());

//        CShape shape = new CShape();
    }

}
