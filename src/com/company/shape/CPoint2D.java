package com.company.shape;

public class CPoint2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public CPoint2D(){

    }

    public CPoint2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void init(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double scale){
        double newX = this.x * scale;
        double newY = this.y * scale;
    }

    public double distance(CPoint2D point2D){
        double a = point2D.x - this.x;
        double b = point2D.y - this.y;
        double d;
        d = Math.sqrt(a*a - b*b);
        return d;
    }

    public String getInfo() {
        String strdiem = "( " + this.x + " ," + this.y +" )";
        return strdiem;
    }
}