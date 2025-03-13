package com.student.BankAccount;

public class Bank {
   private String accountNumber;
   private String accountName;
   private double balance;
   private String accountType;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void displayInfo(){
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Account Name: " + this.getAccountName());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Account Type: " + this.getAccountType());

    }
}
