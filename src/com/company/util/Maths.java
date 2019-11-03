package com.company.util;

public class Maths {
    public  static int TimUCLN(int a, int b) {
        int UCLN = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        while(a != b)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        UCLN = a;
        return UCLN;
    }
}
