import java.util.Scanner;
class FactorialCalculator{
      public static void main(String Args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number to calculate its factorial: ");
      int number = sc.nextInt();
      int factorial = 1;
      for(int num=1; num<=number; num++){
      int product = num;     
      factorial = factorial  * product;
     }
      System.out.println("The factorial of " + number + " is " + factorial);
   }
}

