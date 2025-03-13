import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 to convert Fahrenheit to Celsius: ");
        System.out.println("Type 2 to convert Celsius to Fahrenheit: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("In Celsius: " + celsius);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("In Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid choice Please enter 1 or 2");
        }
    }
}
