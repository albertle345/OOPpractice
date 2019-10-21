package com.company.dice;

import java.util.Random;

public class CDice {
    private int side[] = new int[6];

    public void init(int firstSide, int secondSide, int thirdSide, int fouthSide, int fifthSide, int sixthSide){
        this.side[0] = firstSide;
        this.side[1] = secondSide;
        this.side[2] = thirdSide;
        this.side[3] = fouthSide;
        this.side[4] = fifthSide;
        this.side[5] = sixthSide;
    }

    public void init(int side[]){
        for(int i = 1; i <= 6;i++){
            this.side[i] = side[i];
        }
    }

    public int roll(){
        int dice[] = {0, 1, 2, 3, 4, 5};
        Random r = new Random();
        int randomnumber = r.nextInt(dice.length);
        return this.side[randomnumber];
    }
}
