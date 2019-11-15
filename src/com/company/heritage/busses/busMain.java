package com.company.heritage.busses;


import java.util.Scanner;

public class busMain {
    public static void main(String args[]){
        CCenterA center = new CCenterA();
//        CUrban bus1 = new CUrban("B01", "A", 123,100000, 1, 100);
//        center.insert(bus1);
//        CSuburb bus2 = new CSuburb("B02", "B", 135, 500000, "Vung Tau", 3);
//        center.insert(bus2);
//        CUrban bus1A = new CUrban("B01", "A", 123,100200, 1, 100);
//        center.insert(bus1A);
//        CSuburb bus2A = new CSuburb("B02", "B", 135, 400000, "Vung Tau", 3);
//        center.insert(bus2A);

//        int revenue =  center.getRevenueByType(1);
//        System.out.println("doanh thu: "+ revenue);
//        center.info();

        Scanner reader = new Scanner(System.in);
        CUrban cUrban = new CUrban();
        CSuburb suburb = new CSuburb();

        center.insert(suburb.createSuburb(reader));
        center.insert(cUrban.createUrban(reader));

        center.info();
        reader.close();
    }
}
