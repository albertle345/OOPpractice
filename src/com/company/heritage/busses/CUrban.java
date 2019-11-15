package com.company.heritage.busses;

import java.util.Scanner;

public class CUrban extends CBuses {
    private int routeNo;
    private int distance;

    public CUrban() {

    }

    public CUrban(String code, String driverName, int busNO, int revenue, int routeNo, int distance) {
        super(code, driverName, busNO, revenue);
        this.routeNo = routeNo;
        this. distance = distance;
    }


    public CUrban createUrban(Scanner reader) {
       input(reader);
       return new CUrban(this.code, this.driverName, this.busNo, this.revenue, this.routeNo, this.distance);
    }


    public int getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(int routeNo) {
        this.routeNo = routeNo;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void input(Scanner read){
        super.input(read);

        System.out.println("nhap so tuyen: ");
        String strRouteNo = read.nextLine();
        this.routeNo = Integer.valueOf(strRouteNo);

        System.out.println("nhap khoang cach");
        String strDistance = read.nextLine();
        this.distance = Integer.valueOf(strDistance);
    }

    public String output(){
        System.out.println("===Thong tin chuyen xe noi thanh: ");
        String info = super.output();
        return info + " so tuyen: " + this.routeNo + " khoang cach: " + this.distance;
    }
}
