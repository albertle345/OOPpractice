package com.company.student;

public class CStudent {
    private String firstName;
    private String middleName;
    private String lastName;
    private String code;
    private float average;

    public CStudent(String firstName, String middleName, String lastName, String code, float average) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.code = code;
        this.average = average;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getInfo(){
        System.out.println(this.code + "-" + this.firstName + " " + this.middleName + " " + this.lastName + "-" + this.average);

    }

    public void ranking(){
        if(this.average >= 8){
            System.out.println("Excelent");
        }
        if(this.average >=5 && this.average < 8){
            System.out.println("good");
        }
        if(this.average < 5){
            System.out.println("fail");
        }
    }
}
