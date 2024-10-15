import java.util.Scanner;
class ThreeNumberLragestProgram{
      public static void main(String Args[]){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter First Number: ");
      int num1 = scan.nextInt();
      System.out.print("Enter First Number: ");
      int num2 = scan.nextInt();
      System.out.print("Enter First Number: ");
      int num3 = scan.nextInt();
      if(num1>= num2 && num1 >= num3){
       System.out.println("Largest Number is: " + num1);
       }else if(num2 >= num1 && num2 >= num3){
       System.out.println("Largest Number is: " + num2);
       }else{
       System.out.println("Largest Number is: " + num3);
      }
    }
}