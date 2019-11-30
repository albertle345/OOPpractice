package com.company.ElectricBill;

public class CDate {
    private int date;
    private int month;
    private int year;

    public CDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid(){
        switch (this.month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(this.date > 0 && this.date <= 31){
                    return true;
                }
                break;
            case 4: case 6: case 9: case 11:
                if(this.date > 0 && this.date <= 30){
                    return true;
                }
                break;
            case 2:
                if(checkLeapYear(this.year)){
                    if(this.date > 0 && this.date <= 29){
                        return true;
                    }
                }
                else{
                    if(this.date > 0 && this.date <= 28){
                        return true;
                    }
                }
                break;
            default:
                return false;
        }
        return false;
    }
    public String toString(){
        return this.date + "/" + this.month + "/" + this.year;
    }
    private static boolean checkLeapYear(int year) {
        if(year % 100 == 0 && year % 400 == 0)
        {
            return true;
        }
        else
        {
            if(year % 4 == 0)
            {
                return true;
            }
        }
        return false;
    }
}
