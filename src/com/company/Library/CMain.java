package com.company.Library;

import com.sun.jdi.LongValue;

import javax.print.DocFlavor;
import java.sql.ClientInfoStatus;
import java.util.Date;
import java.util.Scanner;

public class CMain {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        CLibrary library = new CLibrary();
//        CDate date = new CDate(29,2, 2016);
//
//        if(date.isValid()){
//            CTextBook textBook = new CTextBook("SGK01", date , 50000, 5, "BGD", 0);
//            library.input(textBook);
//            CTextBook textBook1 = new CTextBook("SGK01", date , 50000, 5, "BGD", 0);
//            library.input(textBook1);
//            CDocument document = new CDocument("STK01", date, 60000, 3, "NXB", 0.5);
//            library.input(document);
//            CDocument document1 = new CDocument("STK02", date, 65000, 23, "NXB", 0.7);
//            library.input(document1);
//       }
//        library.output();
//        System.out.println("Sach giao khoa");
//        library.outputTexBook();
//        System.out.println("Sach tham khao");
//        library.outputDocument();
//
//        long average = library.averageDocumentPrice();
//        System.out.println("gia tri trung binh cua sach tham khao: " + average);
//
//        long textBookPrice = library.totalTextBookPrice();
//        System.out.println("gia tri cua sach giao khoa: " + textBookPrice);


        String chosen = "1";
        do{
            System.out.println("1. nhap sach giao khoa");
            System.out.println("2. nhap sach tham khao");
            System.out.println("3. thong tin sach giao khoa");
            System.out.println("4. thong tin sach tham khao");
            chosen = read.nextLine();

            if(chosen.equals("1")){
                inputTxt(read, library);
            }
            if(chosen.equals("2")){
                inputDoc(read, library);
            }
            if(chosen.equals("3")){
                library.outputTexBook();
            }
            if(chosen.equals("4")){
                library.outputDocument();
            }
            System.out.println("ban co muon tiep tuc khong: 1. co|| 0. khong");
            chosen = read.nextLine();
            if(!chosen.equals("1")){
                break;
            }
        }while (chosen.equals("1"));
    }

    private static void inputDoc(Scanner read, CLibrary library) {
        String chosen = "1";
        do{
            //code
            System.out.println("nhap ma: ");
            String code = read.nextLine();
            //date
            System.out.println("nhap ngay nhap: ");
            String strDay = read.nextLine();
            int day = Integer.valueOf(strDay);
            System.out.println("nhap thang nhap: ");
            String strMonth = read.nextLine();
            int month = Integer.valueOf(strMonth);
            System.out.println("nhap nam nhap");
            String strYear = read.nextLine();
            int year = Integer.valueOf(strYear);
            CDate date = new CDate(day, month, year);
            //price
            System.out.println("nhap gia: ");
            String strPrice = read.nextLine();
            long price = Long.valueOf(strPrice);
            //quantity
            System.out.println("nhap so luong");
            String strQuantity = read.nextLine();
            int quantity = Integer.valueOf(strQuantity);
            //publisher
            System.out.println("nhap nha xuat ban: ");
            String publisher = read.nextLine();
            //tax
            System.out.println("nhap thue: ");
            String strTax = read.nextLine();
            double tax = Double.valueOf(strTax);

            CDocument book = new CDocument(code, date, price, quantity, publisher, tax);
            library.input(book);

            System.out.println("ban co muon tiep tuc: 1.Co || 2.Khong");
            chosen = read.nextLine();
            if(!chosen.equals("1")){
                break;
            }
        }while (chosen.equals("1"));

    }

    private static void inputTxt(Scanner read, CLibrary library) {
        String chosen = "1";
        do{
            //code
            System.out.println("nhap ma: ");
            String code = read.nextLine();
            //date
            System.out.println("nhap ngay nhap: ");
            String strDay = read.nextLine();
            int day = Integer.valueOf(strDay);
            System.out.println("nhap thang nhap: ");
            String strMonth = read.nextLine();
            int month = Integer.valueOf(strMonth);
            System.out.println("nhap nam nhap");
            String strYear = read.nextLine();
            int year = Integer.valueOf(strYear);
            CDate date = new CDate(day, month, year);
            //price
            System.out.println("nhap gia: ");
            String strPrice = read.nextLine();
            long price = Long.valueOf(strPrice);
            //quantity
            System.out.println("nhap so luong");
            String strQuantity = read.nextLine();
            int quantity = Integer.valueOf(strQuantity);
            //publisher
            System.out.println("nhap nha xuat ban: ");
            String publisher = read.nextLine();
            //status
            System.out.println("nhap trang thai: *** nhap 0 neu sach moi || 1 neu sach co***");
            String strStatus = read.nextLine();
            int status = Integer.valueOf(strStatus);

            CTextBook book = new CTextBook(code, date, price, quantity, publisher, status);
            library.input(book);

            System.out.println("ban co muon tiep tuc: 1.Co || 2.Khong");
            chosen = read.nextLine();
            if(!chosen.equals("1")){
                break;
            }
        }while (chosen.equals("1"));

    }
}
