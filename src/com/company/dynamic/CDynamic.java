package com.company.dynamic;

import java.util.ArrayList;

public class CDynamic {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void push(int n){
        arrayList.add(n);
    }

    public int get(int j){
        for(int i = 0; i < arrayList.size();i++){
            if((j - 1) == i)
              return arrayList.get(i);
        }
        return -1;
    }

    public void _toString(){
        System.out.println(arrayList);
    }

}
