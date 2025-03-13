import java.util.Scanner;
class MultiplicationTable{
  public static void main(String Args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a Number for print table: ");
  int number = sc.nextInt();
  int num = 1;
  while(num<number){
  num++;
  int result = number * num;
  System.out.println(num+ " x " + number + " = " +result); 
   }
  }
}