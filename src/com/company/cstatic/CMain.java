package com.company.cstatic;

public class CMain {
    public static void main(String args[]){
        CHonda dream = new CHonda("dream", 20);
        CHonda winner = new CHonda("winner X", 50);
        CHonda msx = new CHonda("MSX 125", 39);
        CHonda exciter = new CHonda("Exciter", 40);
        CHonda rebel = new CHonda("Rebel 500", 200, 471);

        dream.info();
        winner.info();
        msx.info();
        exciter.change();
        exciter.info();
        rebel.info();
    }
}
