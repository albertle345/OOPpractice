package com.company.vehicle;

import com.company.CDate.CDate;
import com.company.dice.CDice;
import com.company.dynamic.CDynamic;
import com.company.number.CFraction;
import com.company.shape.CCircle;
import com.company.shape.CLIne;
import com.company.shape.CPoint2D;
import com.company.shape.CTriangle;
import com.company.student.CClass;
import com.company.student.CStudent;
import com.company.vehicle.CGarage;
import com.company.vehicle.CVehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        CCircle cCircle = new CCircle();
//        cCircle.init(2, 5, 3);
//        cCircle.info();

//        CPoint2D cPoint2D = new CPoint2D();
//        cPoint2D.setX(6);
//        cPoint2D.setY(7);
//        String info = cPoint2D.getInfo();
//        System.out.println(info);
//
//        double x = cPoint2D.getX();
//        System.out.println(x);

//        CPoint2D startPoint = new CPoint2D(1, 2);
//        CPoint2D endPoint = new CPoint2D(2,1);
//
//        CLIne clIne = new CLIne(startPoint, endPoint);
//        clIne.info();
//        CPoint2D pointA = new CPoint2D(1,3);
//        CPoint2D pointB = new CPoint2D(3,2);
//        CPoint2D pointC = new CPoint2D(0,2);
//
//        CTriangle cTriangle = new CTriangle(pointA, pointB, pointC);
//        cTriangle.info();
        CFraction fractionA = new CFraction(1,2);
        CFraction fractionB = new CFraction(3,0);

        //CFraction add = fractionA.addition(fractionB);

        // result.info();
//       CFraction sub = fractionA.subtraction(fractionB);
//       CFraction multi = fractionA.multiple(fractionB);
//       CFraction div = fractionA.divide(fractionB);

        // System.out.println("addition: "+add);
        //sub.info();

//        System.out.println("multiplication: "+multi);
//        System.out.println("division: "+div);
//        CStudent studentA =  new CStudent("Nguyen","Van", "C","HS02",8);
//        CStudent studentB =  new CStudent("Duonq","Quoc", "F","HS02",5);
//        CStudent studentC =  new CStudent("Le","Thi", "J","HS02",9);
//
//        CClass classroom = new CClass();
//        classroom.insert(studentA);
//        classroom.insert(studentB);
//        classroom.insert(studentC);
//
//        classroom.infoClass();

//        CDate time = new CDate(5, 4, 22);
//        time.checkValid();
//
//        System.out.println(time.toString());
//        System.out.println( time.checkValid());
//
//        CDynamic array = new CDynamic();
//        array.push(3);
//        array.push(5);
//        array.push(9);
//        array.push(10);
//
//        array._toString();
//
//        System.out.println(array.get(3));

//        CVehicle futureNeo = new CVehicle(100, 35000000, "Loan", "Future");
//        CVehicle fordRanger = new CVehicle(3000, 250000000, "Tinh", "Ford Ranger");
//        CVehicle landScape = new CVehicle(1500, 1000000000, "Triet", "LandScape");
//
//        CGarage garage = new CGarage();
//
//        garage.insert(futureNeo);
//        garage.insert(fordRanger);
//        garage.insert(landScape);
//        garage._toString();
        CGarage garage = new CGarage();
        Scanner reader = new Scanner(System.in);
        String chosen = "";
//
//        System.out.println("1. nhap thong tin xe an phim");
//        System.out.println("2. xuat bang gia cua xe an phim");
//        System.out.println("3. thoat an phim");



//        System.out.println("Moi nhap lua chon: ");
//        chosen = reader.nextLine();
//
//
//        switch (chosen){
//            case "1":
//                input(garage, reader);
//                break;
//            case "2":
//                output(garage);
//                break;
//            default:break;
//        }



        do{
            System.out.println("1. nhap thong tin xe an phim");
            System.out.println("2. xuat bang gia cua xe an phim");
            System.out.println("3. thoat an phim");


            System.out.println("Moi nhap lua chon: ");
            chosen = reader.nextLine();

            switch (chosen){
                case "1":
                    input(garage, reader);
                    break;
                case "2":
                    //input(garage, reader);
                    output(garage);
                    break;
                default:break;
            }

            if((!chosen.equals("1")) && !chosen.equals("2")){
                System.out.println("ket thuc chuong trinh");
                break;
            }
        }while(chosen.equals("1") || chosen.equals("2"));

    }

    private static void input(CGarage garage, Scanner reader) {
        System.out.println("Input...");
        String chosen = "1";
        do {
            System.out.println("Moi nhap thong tin xe: ");
            // owner
            System.out.println("nhap chu xe");
            String owner = reader.nextLine();

            // brand
            System.out.println("nhap hang xe");
            String brand = reader.nextLine();
            // price
            System.out.println("nhap gia xe");
            String strPrice = reader.nextLine();
            long price = Long.valueOf(strPrice);
            //capacity
            System.out.println("nhap dung tich");
            String strCapacity = reader.nextLine();
            int capacity = Integer.valueOf(strCapacity);
            // constructor -> xe
            CVehicle car = new CVehicle(owner, brand, capacity, price);
            // add Gara
            garage.insert(car);

            System.out.println("Ban muon them xe khong ? 1 - co || 0 - khong");
            chosen = reader.nextLine();

            if(!chosen.equals("1")){
                break;
            }
        }while (chosen.equals("1"));
        // output(garage);
    }
    private static void output(CGarage garage) {
        System.out.println("Output...");
        //garage._toString();
        if(!garage.isEmpty()){
            garage._toString();
        }else {
            System.out.println("het hang");
        }
    }
}
