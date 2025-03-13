import java.util.Scanner;
class EvenOddProgram{
	public static void main(String Args[]){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int number = scan.nextInt();
	if(number %2 == 0){
	System.out.println(number+" is Even Number");
	}else{
              System.out.println(number + " is Odd Number");
              }
        }
}