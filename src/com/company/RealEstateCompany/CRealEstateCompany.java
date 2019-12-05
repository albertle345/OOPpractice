package com.company.RealEstateCompany;

import com.company.book.CLibrary;

import java.util.ArrayList;

public class CRealEstateCompany {
    private ArrayList<CRealEstate> realEstateComp = new ArrayList<>();

    public void input(CRealEstate realEstate){
        realEstateComp.add(realEstate);
    }

    public void outputHome(){
        System.out.println("danh sach ban nha: ");
        for(int i = 0; i < realEstateComp.size(); i++){
            CRealEstate realEstate = realEstateComp.get(i);
            if(realEstate instanceof CHomeTrans){
                CHomeTrans homeTrans = (CHomeTrans) realEstate;
                String info = homeTrans.toString();
                System.out.println(info);
            }
        }
    }

    public void outputLand(){
        System.out.println("danh sach ban dat: ");
        for(int i = 0; i < realEstateComp.size(); i++){
            CRealEstate realEstate = realEstateComp.get(i);
            if(realEstate instanceof CLandTrans){
                CLandTrans landTrans = (CLandTrans) realEstate;
                String info = landTrans.toString();
                System.out.println(info);
            }
        }
    }

    public int quantityLand(){
        int count = 0;
        for(int i = 0; i < realEstateComp.size();i++){
            CRealEstate realEstate = realEstateComp.get(i);
            if(realEstate instanceof CLandTrans){
                count++;
            }
        }
        return count;
    }

    public int quantityHome(){
        int count = 0;
        for(int i = 0; i < realEstateComp.size();i++){
            CRealEstate realEstate = realEstateComp.get(i);
            if(realEstate instanceof CHomeTrans){
                count++;
            }
        }
        return count;
    }
    public long averagePaymentLand(){
        long totalPayment = 0;
        for (int i = 0; i < realEstateComp.size();i++){
            CRealEstate realEstate = realEstateComp.get(i);
            if(realEstate instanceof CLandTrans){
                CLandTrans landTrans = (CLandTrans) realEstate;
                totalPayment = landTrans.totalPayment();
            }
        }
        int count = quantityLand();
        return totalPayment / count;
    }

    public void outputSep2013(){
        for(int i = 0; i < realEstateComp.size();i++){
            CRealEstate realEstate = realEstateComp.get(i);
            if(realEstate instanceof CLandTrans){
                CLandTrans landTrans = (CLandTrans) realEstate;
                if(landTrans.date.getMonth() == 9 && landTrans.date.getYear() == 2013){
                    String info = landTrans.toString();
                    System.out.println(info);
                }
            }
            else if(realEstate instanceof CLandTrans){
                CHomeTrans homeTrans = (CHomeTrans) realEstate;
                if(homeTrans.date.getMonth() == 9 && homeTrans.date.getYear() == 2013){
                    String info = homeTrans.toString();
                    System.out.println(info);
                }
            }
        }
    }
}
