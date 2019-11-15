package com.company.heritage.busses;

import java.util.ArrayList;

public class CCenterA {
    ArrayList busList = new ArrayList<CBuses>();

    public void insert(Object bus){
        busList.add(bus);
    }

    public int getRevenueByType(int type){
        int totalRvenue= 0;

        if(type == 1){//noi thanh
            for(int i = 0;i < busList.size();i++){
                Object item = busList.get(i);
                if(item instanceof CUrban){
                    totalRvenue = totalRvenue+ ((CUrban) item).getRevenue();
                }
            }
        }

        if(type == 2){//ngoai thanh
            for(int i = 0;i < busList.size();i++){
                Object item = busList.get(i);
                if(item instanceof CSuburb){
                    totalRvenue = totalRvenue+ ((CSuburb) item).getRevenue();
                }
            }
        }
        return totalRvenue;
    }

    public void info(){
        for(int i = 0; i < busList.size();i++){
           CBuses item = (CBuses) busList.get(i);
           System.out.println(item.output());
        }
    }
}
