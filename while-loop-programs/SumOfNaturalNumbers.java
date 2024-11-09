import java.util.Scanner;
class SumOfNaturalNumbers{
    public static void main(String Args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number for sum of     natural Numbers: ");
    int number = sc.nextInt();
    int sum = 0;
    int num = 1;
    while(num<=number){
    num++;
    sum = sum + num;
     }
     System.out.println("The sum of the First " + number + " Natural numbers is " + sum);

   }

}