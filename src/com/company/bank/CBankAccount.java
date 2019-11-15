package com.company.bank;

import java.rmi.StubNotFoundException;

public class CBankAccount {
    long accountNumber;
    String accountName;
    double acountBalance;

    final double interest = 0.035;

    public CBankAccount(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.acountBalance = 50;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAcountBalance() {
        return acountBalance;
    }

    public void setAcountBalance(double acountBalance) {
        this.acountBalance = acountBalance;
    }

    public double deposit(double deposit){
         if(this.acountBalance > deposit){
             this.acountBalance = this.acountBalance - deposit;
         }
         return this.acountBalance;
    }

    public double withdraw(double withdraw){
        this.acountBalance = this.accountNumber - withdraw;
        return this.acountBalance;
    }

    public double maturity(){
        this.acountBalance = this.acountBalance + this.acountBalance * interest;
        return this.acountBalance;
    }

    public void transfer(CBankAccount bankAccount, double transfer){
        if(checkExist(bankAccount.getAccountName(), bankAccount.getAccountNumber())){
            if(this.acountBalance > transfer){
                this.acountBalance = this.acountBalance - transfer;
            }
            else{
                System.out.println("khong du tien de thuc hien");
            }
        }
        else{
            System.out.println("tai khoan khong hop le");
        }
    }

    private boolean checkExist(String accountName, long accountNumber) {
        return true;
    }
}
