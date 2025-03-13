import java.util.Scanner;
class LeapYearProgram{
      public static void main(String Args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a Year: ");
      int year = scan.nextInt();
      if(year %4==0){
        System.out.println(year+" is Leap year");
        }else{
         System.out.println(year+" is Not Leap year");
        }
     
    }
}