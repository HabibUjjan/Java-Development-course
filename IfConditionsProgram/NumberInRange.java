import java.util.Scanner;
class NumberInRange{
     public static void main(String Args[]){
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter Number: ");
     int number = scan.nextInt();
     if (number >=10 && number <= 50){
     System.out.println("Number is in Range") ;
    } else{
     System.out.println("Number is not Range");
   }
  }
}
