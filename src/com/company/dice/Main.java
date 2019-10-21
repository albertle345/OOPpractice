package com.company.dice;

public class Main {
    public static void main(String[] args) {
        // write your code here
        CDice dice = new CDice();
        dice.init(1, 2, 3, 4, 5, 6);
        int random = dice.roll();
        System.out.println("dice roll side number: "+random);
    }
}
