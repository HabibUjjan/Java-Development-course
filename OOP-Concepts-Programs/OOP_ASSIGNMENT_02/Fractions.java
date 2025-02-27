import java.util.Scanner;
public class Fractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first fraction (a/b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second fraction (c/d): ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int resultNumerator = 0;
        int resultDenominator = 0;
        if (operator == '+') {
            resultNumerator = (a * d) + (b * c);
            resultDenominator = b * d;
        } else if (operator == '-') {
            resultNumerator = (a * d) - (b * c);
            resultDenominator = b * d;
        } else if (operator == '*') {
            resultNumerator = a * c;
            resultDenominator = b * d;
        } else if (operator == '/') {
            resultNumerator = a * d;
            resultDenominator = b * c;
        } else {
            System.out.println("Invalid Operator");
        }
        System.out.println("Result: " + resultNumerator + "/" + resultDenominator);
    }
}
