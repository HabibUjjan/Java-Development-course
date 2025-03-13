import java.util.Scanner;
class FibonacciSequence{
   public static void main(String Args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Number for FibonacciSequence: ");
   int number = sc.nextInt();
   int first = 1;
   int second = 1;
   int next = first + second;
   int i = 1;
   while(i<=number){
   i++;
   first = second;
   second = next;
   next = first + second;
   System.out.println(next);
      }
   }
}