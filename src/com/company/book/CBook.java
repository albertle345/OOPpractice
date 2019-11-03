package com.company.book;

public class CBook {
    private String code;
    private String producer;
    private int numberOfVersion;
    private String author;
    private int pages;

    public CBook(String code, String producer, int numberOfVersion, String author, int pages) {
        this.code = code;
        this.producer = producer;
        this.numberOfVersion = numberOfVersion;
        this.author = author;
        this.pages = pages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getNumberOfVersion() {
        return numberOfVersion;
    }

    public void setNumberOfVersion(int numberOfVersion) {
        this.numberOfVersion = numberOfVersion;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString(){
        return this.code + " - " + this.producer + " - " + this.numberOfVersion + " - " + this.author +" - " + this.pages;
    }
}
