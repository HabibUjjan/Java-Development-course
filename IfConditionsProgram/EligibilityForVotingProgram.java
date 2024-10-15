import java.util.Scanner;
class EligibilityForVotingProgram{
       public static void main(String Args[]){
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Your Age: ");
       int age = scan.nextInt();
       if(age>18){
       System.out.println("You are Eligibal For Vote"); 

       }else{
       System.out.println("You are not Eligibal For Vote"); 
       }

    }

}