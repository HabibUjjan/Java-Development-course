import java.util.Scanner;
class SumOfNaturalNumbers{
        public static void main(String Args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number until you wants the sum: ");
        int number = sc.nextInt();
        int sum = 0;
        for(int num = 1; num<=number; num++){
        sum = sum + num;
    }
        System.out.println("The sum of the First " + number + " Natural numbers is " + sum);

   }

}