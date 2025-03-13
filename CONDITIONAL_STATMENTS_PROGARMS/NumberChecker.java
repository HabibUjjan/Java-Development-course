import java.util.Scanner;
class NumberChecker{
    public static void main(String Args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scan.nextInt();
        if(number > 0){
         System.out.println(number + " is Positive Number");
         }else if(number < 0){
         System.out.println(number + " is Negative Number");
      }else {
            System.out.println("Number is "+number);
        }
    }
}