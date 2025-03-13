import java.util.Scanner;
class CheckforPrimeNumber{
     public static void main(String Args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a Number Check if It is Prime: ");
     int number = sc.nextInt();
     boolean isPrime = true;
     if(number<=1){
     isPrime = false;
      }else{
     for(int num=2; num<number; num++){
     if(number % num==0){
     isPrime=false;
          }
        }
   }
      if(isPrime){
      System.out.println(number + " is a Prime Number");
      } else{
       System.out.println(number + " is not a Prime Number");
       }
    }

}