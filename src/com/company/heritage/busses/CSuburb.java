package com.company.heritage.busses;

import javax.print.DocFlavor;
import java.util.Scanner;

public class CSuburb extends CBuses {
    private String destination;
    private int days;

    public CSuburb(){}

    public CSuburb(String code, String driverName, int busNO, int revenue, String destination, int days) {
        super(code, driverName, busNO, revenue);
        this.destination = destination;
        this.days = days;
    }
    public CSuburb createSuburb(Scanner reader) {
        input(reader);
        return new CSuburb(this.code, this.driverName, this.busNo, this.revenue, this.destination, this.days);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void input(Scanner read){
        super.input(read);
        System.out.println("nhap diem den: ");
        this.destination = read.nextLine();
        System.out.println("nhap ngay di: ");
        String strDay = read.nextLine();
        this.days = Integer.valueOf(strDay);
    }

    public String output(){
        System.out.println("===thong tin xe ngoai thanh");
        String info = super.output();
        return info + " diem den la: " + this.destination + " so ngay: " + this.days;
    }

}
