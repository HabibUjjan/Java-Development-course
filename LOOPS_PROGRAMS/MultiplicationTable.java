import java.util.Scanner;
class MultiplicationTable{
   public static void main(String Args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Number for Table: ");
   int number = sc.nextInt();
   for(int num=1; num<=10; num++){
   int result = number * num;
   System.out.println(num+ " x " + number + " = " +result); 
     }
   }
}