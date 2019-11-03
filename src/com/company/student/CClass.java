package com.company.student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CClass {
    ArrayList<CStudent> listStudents = new ArrayList<CStudent>();

    public CClass(ArrayList<CStudent> listStudents) {
        this.listStudents = listStudents;
    }



    public ArrayList<CStudent> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<CStudent> listStudents) {
        this.listStudents = listStudents;
    }

    public void insert(CStudent students){
        int distinct = check(students);
        if(distinct == 0){
            listStudents.add(students);
        }
        else{
            System.out.println("already exist");
        }
    }

    public void infoClass(){
        for(int i = 0; i < listStudents.size();i++){
                listStudents.get(i).getInfo();
        }
    }

    public int check(CStudent student){
        int flag = 0;
        for(int i = 0;i < listStudents.size();i++){
            if(student.getCode().equals(listStudents.get(i).getCode())) {
                flag++;
                break;
            }
        }
        return flag;
    }
}
