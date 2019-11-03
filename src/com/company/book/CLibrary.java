package com.company.book;

import java.util.ArrayList;

public class CLibrary {
    ArrayList<CBook> books = new ArrayList<>();
    ArrayList<CMagazine> magazines = new ArrayList<>();
    ArrayList<CNewspaper> newspapers = new ArrayList<>();

    public void insert(Object item){
        if(item instanceof CBook){
            CBook book = (CBook)item;
            this.books.add(book);
        }else if(item instanceof CMagazine){
            CMagazine magazine = (CMagazine)item;
            this.magazines.add(magazine);
        }else if(item instanceof CNewspaper){
            CNewspaper newspaper = (CNewspaper)item;
            this.newspapers.add(newspaper);
        }
    }

    public void infoBook(){
        for(int i = 0; i < books.size();i++){
            System.out.println(books.get(i).toString());
        }
    }

    public void infoMagazine(){
        for(int i = 0; i < magazines.size();i++){
            System.out.println(magazines.get(i).toString());
        }
    }

    public void infoNewspaper(){
        for(int i = 0; i < newspapers.size();i++){
            System.out.println(newspapers.get(i).toString());
        }
    }

    public void infoMaterial(){
        infoBook();
        infoMagazine();
        infoNewspaper();
    }

    public void find(int i){
        switch (i){
            case 1:
                infoBook();
                break;
            case 2:
                infoMagazine();
                break;
            case 3:
                infoNewspaper();
                break;
            default:
                break;
        }
    }
}
