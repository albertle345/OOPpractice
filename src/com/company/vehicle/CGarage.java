package com.company.vehicle;

import java.util.ArrayList;

public class CGarage {
    private ArrayList<CVehicle> listCars = new ArrayList<>();

    public void insert(CVehicle vehicle){
            listCars.add(vehicle);
    }

    public boolean isEmpty(){
       // return listCars.size() > 0;
        if(listCars.size() <= 0){
            return true;
        }
            return false;
    }

    public void _toString(){
        System.out.println("Ten chu xe" + "\t\t\t" + "loai xe" + "\t\t\t" + "dung tich" + "\t\t\t" + "gia xe" + "\t\t\t" + "thue" + "\t\t\t" + "lan banh");
        for(int i = 0; i < listCars.size();i++){
            String infoItem = listCars.get(i).toString();
            System.out.println(infoItem);
        }
    }
}
