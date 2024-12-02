import java.util.Scanner;
class ArmstrongProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = 0;
        for (int tempNumber = number; tempNumber != 0; tempNumber /= 10) {
            digits++;
        }
        for (int tempNumber = number; tempNumber != 0; tempNumber /= 10) {
            int digit = tempNumber % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}
