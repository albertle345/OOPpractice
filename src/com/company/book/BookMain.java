package com.company;

import com.company.CDate.CDate;
import com.company.book.CBook;
import com.company.book.CLibrary;
import com.company.book.CMagazine;
import com.company.book.CNewspaper;
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

public class BookMain {

    public static void main(String[] args) {
        CBook book = new CBook("B01", "NXB", 1, "A", 300);
        CMagazine magazine = new CMagazine("M01", "B", 2, "2.0.1", "2/11/19");
        CNewspaper newspaper = new CNewspaper("N01", "C", 4, "2/11/19");

        CLibrary library = new CLibrary();
        String chosen = "1";
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("1. nhap thong tin tai lieu");
            System.out.println("2. tim thong tin lieu");
            System.out.println("3. thoat");

            chosen = read.nextLine();

            switch (chosen) {
                case "1":
                    input(library, read);
                    break;
                case "2":
                    output(library, read);
                    break;
                default:
                    break;

            }

            if ((!chosen.equals("1")) && !chosen.equals("2")) {
                System.out.println("ket thuc chuong trinh");
                break;
            }

        } while (chosen.equals("1") || chosen.equals("2"));

        read.close();

    }

    public static void input(CLibrary library, Scanner read) {
        String chosen = "1";
        String inputType = "1";
        do {
            System.out.println("1. nhap sach");
            System.out.println("2. nhap tap chi");
            System.out.println("3. nhap bao");
            inputType = read.nextLine();

            switch (inputType) {
                case "1":
                    inputBook(library, read);
                    break;
                case "2":
                    inputMagazine(library, read);
                    break;
                case "3":
                    inputNewspaper(library, read);
                    break;
                default:
                    break;
            }

            if (!chosen.equals("1") || !chosen.equals("2")) {
                break;
            }
        } while (chosen.equals("1") || chosen.equals("2"));

    }

    public static void inputBook(CLibrary library, Scanner read) {
        String inputType = "1";
        do {
            //code
            System.out.println("nhap ma");
            String code = read.nextLine();
            //producer
            System.out.println("nhap nha xuat ban");
            String producer = read.nextLine();
            //version
            System.out.println("nhap version");
            String strVersion = read.nextLine();
            int version = Integer.valueOf(strVersion);
            //author
            System.out.println("nhap tac gia");
            String author = read.nextLine();
            //pages
            System.out.println("nhap so trang");
            String strPages = read.nextLine();
            int pages = Integer.valueOf(strPages);

            CBook book = new CBook(code, producer, version, author, pages);

            library.insert(book);

            System.out.println("Ban muon them sach khong ? 1 - co || 0 - khong");
            inputType = read.nextLine();

            if (!inputType.equals("1")) {
                break;
            }
        } while (inputType.equals("1"));
    }

    public static void inputMagazine(CLibrary library, Scanner read) {
        String inputType = "1";
        do {
            //code
            System.out.println("nhap ma");
            String code = read.nextLine();
            //producer
            System.out.println("nhap nha xuat ban");
            String producer = read.nextLine();
            //numberOfVersion
            System.out.println("nhap so lan tai ban");
            String strVersion = read.nextLine();
            int numberOfversion = Integer.valueOf(strVersion);
            //version
            System.out.println("nhap version");
            String version = read.nextLine();
            //dateOfEstablish
            System.out.println("nhap ngay phat hanh");
            String dateOfEstablish = read.nextLine();

            CMagazine magazine = new CMagazine(code, producer, numberOfversion, version, dateOfEstablish);

            library.insert(magazine);

            System.out.println("Ban muon them sach khong ? 1 - co || 0 - khong");
            inputType = read.nextLine();

            if (!inputType.equals("1")) {
                break;
            }
        } while (inputType.equals("1"));
    }

    public static void inputNewspaper(CLibrary library, Scanner read) {
        String inputType = "1";
        do {
            //code
            System.out.println("nhap ma");
            String code = read.nextLine();
            //producer
            System.out.println("nhap nha xuat ban");
            String producer = read.nextLine();
            //version
            System.out.println("nhap version");
            String strVersion = read.nextLine();
            int version = Integer.valueOf(strVersion);
            //dateOfEstablish
            System.out.println("nhap ngay phat hanh");
            String dateOfestablish = read.nextLine();

            CNewspaper newspaper = new CNewspaper(code, producer, version, dateOfestablish);

            library.insert(newspaper);

            System.out.println("Ban muon them sach khong ? 1 - co || 0 - khong");
            inputType = read.nextLine();

            if (!inputType.equals("1")) {
                break;
            }
        } while (inputType.equals("1"));
    }

    public static void output(CLibrary library ,Scanner read){
        String chosen = "1";
        int iChosen = 5;
        do{
            System.out.println("1. thong tin sach");
            System.out.println("2. thong tin tap chi");
            System.out.println("3. thong tin bao");
            System.out.println("4. tat ca thong tin");
            System.out.println("5. ngung chuong trinh");

            chosen = read.nextLine();
            iChosen = Integer.valueOf(chosen);

            switch (iChosen){
                case 1:
                    library.infoBook();
                    break;
                case 2:
                    library.infoMagazine();
                    break;
                case 3:
                    library.infoNewspaper();
                    break;
                case 4:
                    library.infoMaterial();
                default:
                    break;
            }
            System.out.println("chon che do xem");

            if(iChosen > 4){
                break;
            }

        }while( iChosen >= 1 && iChosen <= 4 );
    }

}

