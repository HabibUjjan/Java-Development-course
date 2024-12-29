import java.util.Scanner;
class BankAccount {
    int balance;
    void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.print("How much money you want to deposit in your account: ");
        int depositMoney = s.nextInt();
        balance = balance + depositMoney;
        System.out.println("Deposited: " + depositMoney);
        System.out.println("Your current account balance is: " + balance);
    }
    void withdraw() {
        Scanner s = new Scanner(System.in);
        System.out.print("How much money you want to withdraw from your account: ");
        int withdrawMoney = s.nextInt();
        if (balance - withdrawMoney >= 0) {
            balance = balance - withdrawMoney;
            System.out.println("Withdrawn: " + withdrawMoney);
        } else {
            System.out.println("Insufficient funds.");
        }
        System.out.println("Your current account balance is: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw() {
        Scanner s = new Scanner(System.in);
        System.out.print("How much money you want to withdraw from your account: ");
        int withdrawMoney = s.nextInt();
        if (balance - withdrawMoney >= 100) {
            balance = balance - withdrawMoney;
            System.out.println("Withdrawn: " + withdrawMoney);
        } else {
            System.out.println("Cannot withdraw. Balance must remain above 100.");
        }
        System.out.println("Your current account balance is: " + balance);
    }
}

class Bank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount myAccount = new SavingsAccount();
        System.out.println("Choose an action: ");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdraw money");
        System.out.println("3. Check balance");
        int choice = scanner.nextInt();
        if (choice == 1) {
            myAccount.deposit();
        } else if (choice == 2) {
            myAccount.withdraw();
        } else if (choice == 3) {
            System.out.println("Current Balance: " + myAccount.balance);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
        System.out.println("Thank you for using our services");
    }
}
