package com.company.RealEstateCompany;

public class CType {
    private String name;

    public CType() {
        this.name = "";
    }

    public boolean inputCType(String name) {
        //Check type
        if (checkType(name)){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean checkType(String name){
        String type[] = {"A", "B", "C"};
        for(int i = 0; i < type.length;i++){
            if(name.equals(type[i])){
                return true;
            }
        }
        return false;
    }

    public long payment(long unitPrice, int area){
        long totalPayment = 0;
        if (name.equals("A")){
            totalPayment = area * unitPrice;
        }
        else if(name.equals("B") || name.equals("C")){
            totalPayment =(long) (area * unitPrice * 1.5);
        }
        return totalPayment;
    }

    public String toString(){
        return this.name;
    }
}
