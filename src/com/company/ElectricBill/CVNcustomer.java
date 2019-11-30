package com.company.ElectricBill;

public class CVNcustomer extends CCustomer {
    private CCustomerType customers;
    private int quota = 50;

    public CVNcustomer(String code, String fullName, CDate date, CCustomerType customers,int amount, long unitPrice) {
        super(code, fullName, date, amount, unitPrice);
        this.customers = customers;
    }

    public String toString(){
        return "[khach VietNam] " + "ma: " + this.code + ", ten: " + this.fullName + ", ngay: " + this.date + ", doi tuong khach hang: " + this.customers + ", so luong: " + this.amount + ", don gia: " + this.unitPrice + ", dinh muc: " + this.quota;
    }

    public long totalPayment(){
        long totalAmount = 0;
        if(this.amount <= this.quota){
            totalAmount = this.amount * this.unitPrice;
        }
        else if(this.amount > this.quota){
            totalAmount =(long) (this.amount * this.unitPrice * this.quota + (this.amount - this.quota) * this.unitPrice * 2.5);
        }
        return totalAmount;
    }
}
