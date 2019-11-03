package com.company.shape;

public class CTriangle {
    private CPoint2D point1 = new CPoint2D();
    private CPoint2D point2 = new CPoint2D();
    private CPoint2D point3 = new CPoint2D();

    public CTriangle(CPoint2D point1, CPoint2D point2, CPoint2D point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public CPoint2D getPoint1() {
        return point1;
    }

    public CPoint2D getPoint2() {
        return point2;
    }

    public CPoint2D getPoint3() {
        return point3;
    }

    public void setPoint1(CPoint2D point1) {
        this.point1 = point1;
    }

    public void setPoint2(CPoint2D point2) {
        this.point2 = point2;
    }

    public void setPoint3(CPoint2D point3) {
        this.point3 = point3;
    }


    private boolean checkTriangle(){
        double d1 = point1.distance(point2);
        double d2 = point2.distance(point3);
        double d3 = point1.distance(point3);
        if(d2 + d1 > d3){
            return true;
        }
        return false;
    }

    public void info(){
        if(checkTriangle()){
            System.out.println("it is a triangle");
            System.out.println("point A:" + point1.getInfo());
            System.out.println("point B:" + point2.getInfo());
            System.out.println("point C:" + point3.getInfo());
        }
        else {
            System.out.println("nope");
        }
    }
}
