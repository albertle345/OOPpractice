package com.company.CSuper;

public class CiPhone11 extends CXSMax {
    private int camera;

    public CiPhone11(double size, int price, int camera) {
        super(size, price);
        this.camera = camera;
    }


    public void info(){
        super.charger = "type C";
        super.faceID();
        System.out.println("model: "+ this.size + ", price: " + this.price + ", camera: " + this.camera + ", charger: " + super.charger);
    }
}
