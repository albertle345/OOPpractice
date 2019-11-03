package com.company.book;

public class CNewspaper {
    private String code;
    private String producer;
    private int numberOfVersion;
    private String dateOfEstablish;

    public CNewspaper(String code, String producer, int numberOfVersion, String dateOfEstablish) {
        this.code = code;
        this.producer = producer;
        this.numberOfVersion = numberOfVersion;
        this.dateOfEstablish = dateOfEstablish;
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

    public String getDateOfEstablish() {
        return dateOfEstablish;
    }

    public void setDateOfEstablish(String dateOfEstablish) {
        this.dateOfEstablish = dateOfEstablish;
    }

    public String toString(){
        return this.code + " - " + this.producer + " - " + this.numberOfVersion + " - " + this.dateOfEstablish;
    }
}
