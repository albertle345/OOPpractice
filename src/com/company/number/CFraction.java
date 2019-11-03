package com.company.number;

import com.company.util.Maths;

public class CFraction {
    private int num;
    private int den;

    public CFraction(int num, int den) {
        if(den != 0){
            this.den = den;
        }
        else{
            this.den = 1;
        }
        this.num = num;

    }

    public boolean check(){
        if(den == 0){
            return false;
        }
        return true;
    }

    public CFraction addition (CFraction fractionB){
        int numkq = this.num * fractionB.den + this.den * fractionB.num;
        int denkq = this.den * fractionB.den;

        CFraction result = new CFraction(numkq, denkq);
       // result.compact();
        return result;
    }

    public CFraction subtraction (CFraction fractionB){
        int numkq = this.num * fractionB.den - this.den * fractionB.num;
        int denkq = this.den * fractionB.den;

        CFraction result = new CFraction(numkq, denkq);
        return result.compact(result);
    }

    public CFraction multiple(CFraction fractionB){
        int numkq = this.num * fractionB.num;
        int denkq = this.den * fractionB.den;

        CFraction result = new CFraction(numkq, denkq);
        //result.compact();
        return result;
    }

    public CFraction divide(CFraction fractionB){
        int numkq = this.num * fractionB.den;
        int denkq = this.den * fractionB.num;

        CFraction result = new CFraction(numkq, denkq);
       // result.compact();
        return result;
    }

    public int compare (CFraction fractionB){
        float firstFraction =(float) this.num / this.den;
        float secondFraction =(float) fractionB.num / fractionB.den;

        if(firstFraction - secondFraction > 0){
            return 1;
        }
        if(firstFraction - secondFraction == 0){
            return 0;
        }
        else{
            return -1;
        }
    }


    public CFraction compact(CFraction ps) {
        int numTemp = ps.num;
        int denTemp = ps.den;

        int UCLN = Maths.TimUCLN(numTemp, denTemp);
        return  new CFraction(ps.num / UCLN, ps.den / UCLN);

    }

    public void info(){
        System.out.println("fraction: " + this.num +"/" + this.den);
    }
}
