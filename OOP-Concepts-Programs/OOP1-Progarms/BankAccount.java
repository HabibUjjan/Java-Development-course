class BankAccount{
   String accountNumber; 
   String accountName; 
   double balance; 
   String accountType;

   public static void main(String Args[]){
	   BankAccount account1 = new BankAccount();
	   account1.accountNumber = "PK256353221";
	   account1.accountName = "Habibullah";
	   account1.balance = 591000;
	   account1.accountType = "Savings";
	   
	   System.out.println("<<<<<<<<BANK ACCOUNT'S DETAILS>>>>>>>>");
	   System.out.println("Account Number: "+account1.accountNumber);
	   System.out.println("Account Name  : "+account1.accountName	);
	   System.out.println("Balance       : "+account1.balance);
	   System.out.println("Account Type  : "+account1.accountType);
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