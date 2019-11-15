package com.company.overriding;

public class COverriding {
    public static void main(String[] args){
        CBachHoaXanh banana1 = new CBachHoaXanh();
        CMarket banana2 = new CMarket();

        System.out.println("chuoi cua bach hoa xanh: " + banana1.bananaPrice());
        System.out.println("chuoi ngoai cho: "+banana2.bananaPrice());
    }

}
