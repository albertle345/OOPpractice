package com.company.ElectricBill;

import java.util.ArrayList;

public class CElecicalCompany {
    private ArrayList<CCustomer> management = new ArrayList<>();

    public void input(CCustomer customer){
        management.add(customer);
    }

    public void outputVietNam(){
        System.out.println("thong tin khach hang VietNam");
        for(int i = 0; i < management.size(); i++){
            CCustomer person = management.get(i);
            if(person instanceof CVNcustomer){
                CVNcustomer VNcustomer = (CVNcustomer) person;
                String info = VNcustomer.toString();
                System.out.println(info);
            }
        }
    }

    public void outputForeinger(){
        System.out.println("thong tin khach hang nuoc ngoai");
        for(int i = 0; i < management.size();i++){
            CCustomer person = management.get(i);
            if(person instanceof CForeigner){
                CForeigner foreigner = (CForeigner) person;
                String info = foreigner.toString();
                System.out.println(info);
            }
        }
    }

    public int totalVNAmount(){
        int total = 0;
        for(int i = 0; i < management.size(); i++){
            CCustomer person = management.get(i);
            if(person instanceof CVNcustomer){
                CVNcustomer VNcustomer = (CVNcustomer) person;
                total = total + VNcustomer.amount;
            }
        }
        return total;
    }

    public int totalForeignerAmount(){
        int total = 0;
        for(int i = 0; i < management.size(); i++){
            CCustomer person = management.get(i);
            if(person instanceof CForeigner){
                CForeigner foreigner = (CForeigner) person;
                total = total + foreigner.amount;
            }
        }
        return total;
    }

    public long averageForeingerPayment(){
        long total = 0;
        int count = 0;

        for(int i = 0; i < management.size(); i++){
            CCustomer person = management.get(i);
            if(person instanceof CForeigner){
                CForeigner foreigner = (CForeigner) person;
                total = total +  foreigner.totalPayment();
                count++;
            }
        }
        return total / count;
    }
    //thong tin khach hang thang 9
    public void outputSep(){
        for(int i = 0; i < management.size(); i++){
            CCustomer person = management.get(i);
                if(person instanceof CForeigner){
                    CForeigner foreigner = (CForeigner) person;
                    if(foreigner.date.getMonth() == 9){
                        String info = foreigner.toString();
                        System.out.println(info);
                }
            }
                else if(person instanceof CVNcustomer){
                    CVNcustomer VNCustomer = (CVNcustomer) person;
                    if(VNCustomer.date.getMonth() == 9){
                        String info = VNCustomer.toString();
                        System.out.println(info);
                    }
                }
        }
    }

}
