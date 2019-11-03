package com.company.CDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class CDate {
    private int date;
    private int month;
    private int year;

    public static final int MAX_DATE = 2147483647;

    public CDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public CDate(){
//        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Ha_Noi"));
//        this.date = cal.get(Calendar.DAY_OF_MONTH);
//        this.month = cal.get((Calendar.MONTH));
//        this.year = cal.get(Calendar.YEAR);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.date = now.getDayOfMonth();
        this.month = now.getMonthValue();
        this.year = now.getYear();
    }

    public String toString(){
        return this.date + "/" + this.month + "/" + this.year;
    }

    public boolean checkLeapYear() {
        if(this.year % 100 == 0 && this.year % 400 == 0)
        {
            return true;
        }
        else
        {
            if(this.year % 4 == 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean checkValid(){
        if(this.date > 0 && this.month > 0 && this.year > 0){
            if(checkLeapYear()){
                if(this.month == 2){
                    if(this.date > 29){
                        return false;
                    }
                }
            }
            else{
                if(this.month == 2) {
                    if (this.date > 28) {
                        return false;
                    }
                }
                else {
                        switch (this.month){
                            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                                if(this.date > 31){
                                    return false;
                                }
                            case 4: case 6: case 9: case 11:
                                if(this.date > 30){
                                    return false;
                                }
                        }
                    }
            }
            return true;
        }else {
            return false;
        }
    }

}
