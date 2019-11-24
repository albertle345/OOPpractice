package com.company.Library;

import java.util.ArrayList;

public class CLibrary {
    private ArrayList<CBook> listBook = new ArrayList<>();

    public void input(CBook book){
        listBook.add(book);
    }

    public void output(){
        System.out.println("====Thong tin sach trong thu vien:");
        for(int i = 0; i < listBook.size();i++){
            CBook item = listBook.get(i);
            if(item instanceof CTextBook){
                CTextBook textBook = (CTextBook)item;
                String info = textBook.toString();
                System.out.println(info);
            }else if(item instanceof CDocument) {
                CDocument document = (CDocument) item;
                String info = document.toString();
                System.out.println(info);
            }
        }
    }

    public long totalTextBookPrice(){
        long totalTextBookPrice = 0;

        for(int i = 0; i < listBook.size();i++){
            CBook item = listBook.get(i);
//            if(item.getCode().contains("SGK")){
//                // tinh tong
//            }
            if(item instanceof CTextBook){
                CTextBook textBook = (CTextBook)item;
                totalTextBookPrice = totalTextBookPrice + textBook.totalPrice();
            }
        }
        return totalTextBookPrice;
    }

    public long totalDocumentPrice(){
        long totalDocumentPrice = 0;

        for(int i = 0; i < listBook.size(); i++){
            CBook item = listBook.get(i);
            if(item instanceof CDocument){
                CDocument document = (CDocument) item;
                totalDocumentPrice = totalDocumentPrice + document.totalPrice();
            }
        }
        return totalDocumentPrice;
    }

    public long averageDocumentPrice(){
        long averagePrice = 0;
        int count = 0;
        long documentPrice = totalDocumentPrice();

        for (int i = 0; i < listBook.size(); i++){
            CBook item = listBook.get(i);
            if(item instanceof CDocument){
                count++;
            }
        }
        averagePrice = documentPrice / count;
        return averagePrice;
    }

    public void outputTexBook(){
        for(int i = 0; i < listBook.size(); i++){
            CBook item = listBook.get(i);
            if(item instanceof CTextBook){
                CTextBook textBook = (CTextBook) item;
                String info = textBook.toString();
                System.out.println(info);
            }
        }
    }

    public void outputDocument(){
        for(int i = 0; i < listBook.size(); i++){
            CBook item = listBook.get(i);
            if(item instanceof CDocument){
                CDocument document = (CDocument) item;
                String info =  document.toString();
                System.out.println(info);
            }
        }
    }
}
