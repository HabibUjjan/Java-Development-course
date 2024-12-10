class BankAccount{
   String accountNumber; 
   String accountName; 
   double balance; 
   String accountType;
	 //  deposit amount methode
	 public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println(amount + " Deposited Successfully Your New balance is: " + balance);
		} else {
			System.out.println("Invalid Deposit Amount");
		}
	}
 
	//  withdraw amount methode
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println(amount + " Withdraw Successfully Your New balance is: " + balance);
		} else {
			System.out.println("Insufficient balance or invalid withdrawal amount");
		}
	}

   public static void main(String Args[]){
	   BankAccount account1 = new BankAccount();
	   account1.accountNumber = "PK256353221";
	   account1.accountName = "Habibullah";
	   account1.balance = 500000;
	   account1.accountType = "Savings";
	   
	   System.out.println("<<<<<<<<BANK ACCOUNT'S DETAILS>>>>>>>>");
	   System.out.println("Account Number: "+account1.accountNumber);
	   System.out.println("Account Name  : "+account1.accountName	);
	   System.out.println("Balance       : "+account1.balance);
	   System.out.println("Account Type  : "+account1.accountType);
	   // Deposit and withdraw methods
       account1.deposit(50000);  // Deposit amount
       account1.withdraw(100000);  // Withdraw amount
	   System.out.println();

	   
	   BankAccount account2 = new BankAccount();
	   account2.accountNumber = "PB321633438";
	   account2.accountName = "Muzzafar Ali";
	   account2.balance = 491000;
	   account2.accountType = "Savings";
	   
	   System.out.println("Account Number: "+account2.accountNumber);
	   System.out.println("Account Name  : "+account2.accountName	);
	   System.out.println("Balance       : "+account2.balance);
	   System.out.println("Account Type  : "+account2.accountType);
	   account2.deposit(50000);  // Deposit amount
       account2.withdraw(100000);  // Withdraw amount
	   System.out.println();
	   
	   BankAccount account3 = new BankAccount();
	   account3.accountNumber = "PT8567232891";
	   account3.accountName = "Shahzad Ali";
	   account3.balance = 391000;
	   account3.accountType = "Savings";
	   
	   

	   System.out.println("Account Number: "+account3.accountNumber);
	   System.out.println("Account Name  : "+account3.accountName	);
	   System.out.println("Balance       : "+account3.balance);
	   System.out.println("Account Type  : "+account3.accountType);
	   System.out.println();
	   
	   BankAccount account4 = new BankAccount();
	   account4.accountNumber = "AT326352176";
	   account4.accountName = "Sajid Hussain";
	   account4.balance = 291000;
	   account4.accountType = "Savings";
	   
	   System.out.println("Account Number: "+account4.accountNumber);
	   System.out.println("Account Name  : "+account4.accountName	);
	   System.out.println("Balance       : "+account4.balance);
	   System.out.println("Account Type  : "+account4.accountType);
	   System.out.println();
	   
	   BankAccount account5 = new BankAccount();
	   account5.accountNumber = "KI12786454";
	   account5.accountName = "Partab Kumar";
	   account5.balance = 191000;
	   account5.accountType = "Savings";
	   
	   System.out.println("Account Number: "+account5.accountNumber);
	   System.out.println("Account Name  : "+account5.accountName	);
	   System.out.println("Balance       : "+account5.balance);
	   System.out.println("Account Type  : "+account5.accountType);
	   System.out.println();
   }
    

}