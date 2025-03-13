import java.util.Scanner;

public class Tollbooth {
    int totalCars = 0;
    double totalMoney = 0.0;

    void payingCar() {
        totalCars++; 
        totalMoney += 0.50;
    }


      void noPayCar() {
        totalCars++; 
    }
    void display() {
        System.out.println("Total Cars: " + totalCars);
        System.out.println("Total Money Collected: $" + totalMoney);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tollbooth tollbooth = new Tollbooth();
        while (true) {
            System.out.println("Press 1 for paying car, 2 for non-paying car, and 0 to exit and display totals");
            System.out.print("Enter option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                tollbooth.payingCar();
                System.out.println("Paying car counted ");
            } else if (choice == 2) {
                tollbooth.noPayCar();
                System.out.println("Non-paying car counted ");
            } else if (choice == 0) {
                tollbooth.display();
                break; 
            } else {
                System.out.println("Invalid choice! Please enter 1, 2, or 0");
            }
        }
    }
}
