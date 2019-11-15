package com.company;
import com.company.bank.CBankAccount;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CBankAccount account = new CBankAccount(1984728228, "Vinh");
        double deposit = account.deposit(1000000);
        System.out.println("so du trong tai khoan cua quy khach la: "+ deposit);
        double withdraw = account.withdraw(50000);
        System.out.println("so du trong tai khoan cua quy khach la: "+ withdraw);
        double maturity = account.maturity();
        System.out.println("so du trong tai khoan cua quy khach la: "+ maturity);
        CBankAccount account1 = new CBankAccount(1231214414, "bla bla");
        account.transfer(account1, 400000);
        System.out.println("so du trong tai khoan cua quy khach la: "+ account.getAcountBalance());

    }

}

