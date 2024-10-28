import java.util.Scanner;
class FibonacciSequence{
     public static void main(String Args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a the Number of Terms: ");
     int number = sc.nextInt();
     int first = 0;
     int second = 1; 
    System.out.print("Fibonacci Sequence: ");
    for(int num=1; num<=number; num++){
    System.out.print(first + " ");
    int next = first + second;
    first = second;
    second = next;
   }
  }
}