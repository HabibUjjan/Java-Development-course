import java.util.Scanner;
class SimpleCalcultor{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choose an option: ");
        int choice = scan.nextInt();
        System.out.print("Enter first number: ");
        int num1 = scan .nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan .nextInt();
        int result =0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("The Result of two numbers is: " + result);
    }
}
