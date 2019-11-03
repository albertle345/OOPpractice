package com.company.shape;

public class CLIne {
    private CPoint2D startPoint;
    private CPoint2D endPoint;

    public CLIne(CPoint2D point1, CPoint2D point2) {
        this.startPoint = point1;
        this.endPoint = point2;
    }

    public void info(){
//        System.out.println("start point: "+startPoint.getX()+","+startPoint.getY());
//        System.out.println("end point: "+endPoint.getX()+","+endPoint.getY());

        System.out.println("StartPoint : " + startPoint.getInfo());
        System.out.println("EndPoint : " + endPoint.getInfo());
    }

}
