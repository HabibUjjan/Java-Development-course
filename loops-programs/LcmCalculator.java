import java.util.Scanner;
class LcmCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        int lcm = 1; 
        for (int num =1; num<= number1*number2; num++) {
            if (num % number1 == 0 && num % number2 == 0) {
                lcm = num;
            }
        }
        System.out.println("Lcm of " + number1 + " and " + number2 + " is: " +lcm);
    }
}
