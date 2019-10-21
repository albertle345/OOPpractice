package com.company.shape;

public class CCircle {
    private CPoint2D center = new CPoint2D();
    private double radious;

    public void init(double x, double y,double radious){
        center.init(x, y);
        this.radious = radious;
    }

    public void info(){
        System.out.println("center of circle: " +this.center.getInfo());
        System.out.println("radioud "+this.radious);
       // double kq = parimenter();
    }

    public double parimenter(){
        double p = 2 * this.radious * 3.14;
        return p;
    }
}
