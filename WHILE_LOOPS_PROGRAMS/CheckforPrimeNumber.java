import java.util.Scanner;
class CheckforPrimeNumber{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number For factor: ");
    int number = sc.nextInt();
    int num = 1;
    int count = 1;
    while(num<=number){
    num++;
    if(number%num == 0){
    System.out.println(num);
    count++;
       }
}if(count == 2){
    System.out.println("Prime");
}else{
    System.out.println("Not Prime");
      }
    }
}