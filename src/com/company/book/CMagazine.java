package com.company.book;

public class CMagazine {
    private String code;
    private String producer;
    private int numberOfVersion;
    private String version;
    private String dateOfEstablish;

    public CMagazine(String code, String producer, int numberOfVersion, String version, String dateOfEstablish) {
        this.code = code;
        this.producer = producer;
        this.numberOfVersion = numberOfVersion;
        this.version = version;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDateOfEstablish() {
        return dateOfEstablish;
    }

    public void setDateOfEstablish(String dateOfEstablish) {
        this.dateOfEstablish = dateOfEstablish;
    }

    public String toString(){
        return this.code + " - " + this.producer + " - " + this.numberOfVersion + " - " + this.version +" - " + this.dateOfEstablish;
    }
}
