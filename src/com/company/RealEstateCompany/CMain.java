package com.company.RealEstateCompany;

public class CMain {
    public static void main(String args[]){
        CDate date = new CDate(2,9, 2013);
        CDate date2 = new CDate(28, 9 , 2019);
        CType type1 = new CType();
        type1.inputCType("A");

        CType type2 = new CType();
        boolean checkType = type2.inputCType("A");

//        CHomeTrans homeTrans1 = new CHomeTrans("afsd", date, 3000000, 1, "Quach Dinh Bao", 100);
//        CLandTrans landTrans1 = new CLandTrans("Asfd", date2, 300000, type1, 45);
//        CHomeTrans homeTrans = new CHomeTrans("sf", date, 4000000, 0, "Le Dai Hanh", 120);
        CRealEstateCompany realEstateCompany = new CRealEstateCompany();

        if(checkType){
            CLandTrans landTrans = new CLandTrans("AFS", date, 4000000, type2, 500);
            realEstateCompany.input(landTrans);
        }

//        realEstateCompany.input(homeTrans);
//        realEstateCompany.input(homeTrans1);
//        realEstateCompany.input(landTrans1);


       // realEstateCompany.outputHome();
        realEstateCompany.outputLand();
        //realEstateCompany.outputSep2013();
       // long payment = realEstateCompany.averagePaymentLand();
       // System.out.println(payment);

    }



}
