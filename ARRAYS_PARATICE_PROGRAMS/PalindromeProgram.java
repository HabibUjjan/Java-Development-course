import java.util.Scanner;
class PalindromeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int reverse = 0;
        int number = sc.nextInt();
        int originalNumber = number;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        if (originalNumber == reverse) {
            System.out.println("The given number " + originalNumber + " is a palindrome");
        } else {
            System.out.println("The given number " + originalNumber + " is not a palindrome");
        }
    }
}
