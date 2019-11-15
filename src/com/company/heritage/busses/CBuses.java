package com.company.heritage.busses;

import java.util.Scanner;

public class CBuses {
    protected String code;
    protected String driverName;
    protected int busNo;
    protected int revenue;

    public CBuses(){

    }

    public CBuses(String code, String driverName, int busNO, int revenue) {
        this.code = code;
        this.driverName = driverName;
        this.busNo = busNO;
        this.revenue = revenue;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNO) {
        this.busNo = busNO;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public void input(Scanner read){
        System.out.println("nhap ma xe: ");
        this.code = read.nextLine();

        System.out.println("nhap ten tai xe: ");
        this.driverName = read.nextLine();

        System.out.println("nhap so xe: ");
        String strBusNo = read.nextLine();
        this.busNo = Integer.valueOf(strBusNo);

        System.out.println("nhap doanh thu: ");
        String strRevenue = read.nextLine();
        this.revenue = Integer.valueOf(strRevenue);
    }

    public String output(){
        return "ma xe: " + this.code + " ten tai xe: " + this.driverName + " so xe: " + this.busNo + " doanh thu: " + this.revenue;
    }
}
