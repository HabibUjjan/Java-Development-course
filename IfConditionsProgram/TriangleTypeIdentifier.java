import java.util.Scanner;
class TriangleTypeIdentifier{
      public static void main(String Args[]){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Side A: ");
      int a = scan.nextInt();
      System.out.print("Enter Side B: ");
      int b = scan.nextInt();
      System.out.print("Enter Side C: ");
      int c = scan.nextInt();
      if(a + b > c && a + c > b && b + c > a ){
      if (a == b && b == c) {
      System.out.println("The Triangle is Equilateral");
      } else if (a == b || a == c || b == c)
      System.out.println("The Triangle is Isosceles");
      }else{
      System.out.println("The Triangle is Scalene");
      }
   }
}