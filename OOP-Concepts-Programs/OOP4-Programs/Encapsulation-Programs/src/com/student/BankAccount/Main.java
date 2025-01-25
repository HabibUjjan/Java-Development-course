package com.student.BankAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********Bank Account's Information*********");
        Bank bank = new Bank();
        bank.setAccountNumber("PK1234578");
        bank.setAccountName("Habibullah");
        bank.setBalance(340000);
        bank.setAccountType("Saving");
        bank.displayInfo();
        System.out.println();


        Bank bank1 = new Bank();
        bank1.setAccountNumber("GH1234578");
        bank1.setAccountName("Admin");
        bank1.setBalance(40000);
        bank1.setAccountType("Student");
        bank1.displayInfo();
        System.out.println();

        Bank bank2 = new Bank();
        bank2.setAccountNumber("GT1234578");
        bank2.setAccountName("Ali");
        bank2.setBalance(30000);
        bank2.setAccountType("Saving");
        bank2.displayInfo();
        System.out.println();

        Bank bank3 = new Bank();
        bank3.setAccountNumber("PK1234578");
        bank3.setAccountName("Kareem");
        bank3.setBalance(10000);
        bank3.setAccountType("Saving");
        bank3.displayInfo();
        System.out.println();
    }
}
