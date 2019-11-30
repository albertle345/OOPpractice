package com.company.ElectricBill;

import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        CElecicalCompany elecicalCompany = new CElecicalCompany();
        Scanner reader = new Scanner(System.in);

        String chosen = "co";
        do{
            System.out.println("1. nhap thong tin khach hang VietNam");
            System.out.println("2. nhap thong tin khach hang nuoc ngoai");
            System.out.println("3. thong tin khach hang");
            System.out.println("4. so luong(KWH) cua tung loai khach");
            System.out.println("5. trung binh thanh tien cua khach nuoc ngoai");
            System.out.println("6. xuat hoa don khach hang trong thang 9");
            chosen = reader.nextLine();

            switch (chosen){
                case "1":
                    inputVietNam(elecicalCompany, reader);
                    break;
                case "2":
                    inputForeigner(elecicalCompany, reader);
                    break;
                case "3":
                    output(elecicalCompany, reader);
                    break;
                case "4":
                    totalAmount(elecicalCompany, reader);
                    break;
                case "5":
                    elecicalCompany.averageForeingerPayment();
                    break;
                case "6":
                    elecicalCompany.outputSep();
                    break;
                default:
                    break;
            }

            System.out.println("ban co muon tiep tuc chuong trinh chinh");
            chosen = reader.nextLine();

            if(!chosen.equals("co")){
                break;
            }
        }while(chosen.equals("co"));
    }

    private static void totalAmount(CElecicalCompany elecicalCompany, Scanner resder) {
        String chosen = "";
        System.out.println("1. so luong(KWh) khach VietNam");
        System.out.println("2. so luong(KWh) khach nuoc ngoai");
        chosen = resder.nextLine();

        switch (chosen){
            case "1":
                elecicalCompany.totalVNAmount();
                break;
            case "2":
                elecicalCompany.totalForeignerAmount();
                break;
            default:
                break;
        }
    }

    private static void output(CElecicalCompany elecicalCompany, Scanner resder) {
        String chosen = "";
        System.out.println("1. xuat thong tin khach VietNam");
        System.out.println("2. cuat thong tin khach nuoc ngoai");
        chosen = resder.nextLine();
        
        switch (chosen){
            case "1":
                elecicalCompany.outputVietNam();
                break;
            case "2":
                elecicalCompany.outputForeinger();
                break;
            default:
                break;
        }
    }

    private static void inputForeigner(CElecicalCompany elecicalCompany, Scanner reader) {
        String chosen = "co";
        do{
            //code
            System.out.println("nhap ma: ");
            String code = reader.nextLine();

            //fullname
            System.out.println("nhap ho va ten: ");
            String fullname = reader.nextLine();

            //date
            System.out.println("nhap ngay ra hoa don: ");
            String strDay = reader.nextLine();
            int day = Integer.valueOf(strDay);
            System.out.println("nhap thang ra hoa don: ");
            String strMonth = reader.nextLine();
            int month = Integer.valueOf(strMonth);
            System.out.println("nhap nam ra hoa don: ");
            String strYear = reader.nextLine();
            int year = Integer.valueOf(strYear);
            CDate date = new CDate(day, month, year);

            //amount
            System.out.println("nhao so luong(KWh): ");
            String strAmount = reader.nextLine();
            int amount = Integer.valueOf(strAmount);

            //unitPrice
            System.out.println("nhap don gia: ");
            String strUnitPrice = reader.nextLine();
            int unitPrice = Integer.valueOf(strUnitPrice);

            //nationality
            System.out.println("nhap quoc tich: ");
            String nationality = reader.nextLine();
            
            CForeigner foreigner = new CForeigner(code, fullname, date, nationality, amount, unitPrice);
            elecicalCompany.input(foreigner);

            System.out.println("ban co muon tiep tuc?");
            chosen = reader.nextLine();


            if(!chosen.equals("co")){
                break;
            }
        }while (chosen.equals("co"));
    }


    private static void inputVietNam(CElecicalCompany elecicalCompany, Scanner reader) {
        String chosen = "co";
        do{
            //code
            System.out.println("nhap ma: ");
            String code = reader.nextLine();

            //fullname
            System.out.println("nhap ho va ten: ");
            String fullname = reader.nextLine();

            //date
            System.out.println("nhap ngay ra hoa don: ");
            String strDay = reader.nextLine();
            int day = Integer.valueOf(strDay);
            System.out.println("nhap thang ra hoa don: ");
            String strMonth = reader.nextLine();
            int month = Integer.valueOf(strMonth);
            System.out.println("nhap nam ra hoa don: ");
            String strYear = reader.nextLine();
            int year = Integer.valueOf(strYear);
            CDate date = new CDate(day, month, year);

            //amount
            System.out.println("nhao so luong(KWh): ");
            String strAmount = reader.nextLine();
            int amount = Integer.valueOf(strAmount);

            //unitPrice
            System.out.println("nhap don gia: ");
            String strUnitPrice = reader.nextLine();
            int unitPrice = Integer.valueOf(strUnitPrice);

            //customers
            System.out.println("nhap sinh hoat: ");
            String living = reader.nextLine();
            System.out.println("nhap kinh doanh: ");
            String business = reader.nextLine();
            System.out.println("nhap san xuat: ");
            String manufactor = reader.nextLine();
            CCustomerType customerType = new CCustomerType(living, business, manufactor);

            CVNcustomer VNcustomer = new CVNcustomer(code, fullname, date, customerType, amount, unitPrice);
            elecicalCompany.input(VNcustomer);

            System.out.println("ban co muon tiep tuc?");
            chosen = reader.nextLine();


            if(!chosen.equals("co")){
                break;
            }
        }while (chosen.equals("co"));
    }
}











