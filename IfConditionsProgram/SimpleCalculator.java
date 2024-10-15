import java.util.Scanner;
class SimpleCalculator{
   public static void main(String Args[]){
   Scanner scan = new Scanner(System.in);
        System.out.println("1- Addtion");
        System.out.println("2- Substraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.print("Enter Your Choice ");
        int choice = scan.nextInt();
        
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter First Number: ");
        int num2 = scan.nextInt();
        
        if(choice == 1){
        int result = num1 + num2;
        System.out.println("The Addition of Two Numbers is: " + result);
      }else if(choice == 2){
        int result = num1 - num2;
        System.out.println("The Subtraction of Two Numbers is: " + result);
        }else if(choice == 3){
        int result = num1 * num2;
        System.out.println("The Subtraction of Two Numbers is: " + result);
        }else if(choice == 4){
        int result = num1 / num2;
        System.out.println("The Subtraction of Two Numbers is: " + result);
        }else {
            System.out.println("Invalid choice");
        }
    }
}