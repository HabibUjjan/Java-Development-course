import java.util.Scanner;
class ReverseNumberProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number: "); 
        int reverse = 0;
        int number = scanner.nextInt(); 
        int originalNumber = number;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder; 
        }
        System.out.println("The reverse of the given number " + originalNumber + " is: " + reverse);
    }
}