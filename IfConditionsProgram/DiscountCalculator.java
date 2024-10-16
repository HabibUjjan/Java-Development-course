import java.util.Scanner;
class DiscountCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total Purchase Amount:");
        double amount = scanner.nextDouble();
        double discount = 0;
        if (amount > 100) {
            discount = amount * 0.10;
        }
        double finalAmount = amount - discount;
        System.out.println("Your Discount is: " + discount);
        System.out.println("Your Final Amount is: " + finalAmount);
    }
}
