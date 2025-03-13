import java.util.Scanner;
class PerfectNumberProgram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a perfect factorial sum number");
        } else {
            System.out.println(originalNumber + " is not a perfect factorial sum number");
        }
    }
}

