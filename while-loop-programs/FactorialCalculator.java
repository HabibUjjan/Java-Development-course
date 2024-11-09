import java.util.Scanner;
class FactorialCalculator{
      public static void main(String Args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number to calculate its factorial: ");
      int number = sc.nextInt();
      int factorial = 1;
      int i = number;
      while(i>0){
      factorial *= i;
      i--;   
      }
      System.out.println("The factorial of " + number + " is " + factorial );
   }
}