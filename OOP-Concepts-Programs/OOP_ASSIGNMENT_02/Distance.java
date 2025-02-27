import java.util.Scanner;

public class Distance {
    int distance;
    String unit;
    String conversionChoice;


    Distance(int distance, String unit) {
        this.distance = distance;
        this.unit = unit;
    }

    void convertDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the unit to convert to (inches, millimeters, kilometers): ");
        conversionChoice = scanner.next();
        if (unit.equals("inches")) {
            if (conversionChoice.equals("millimeters")) {
                System.out.println(distance + " inches = " + (distance * 25.4) + " millimeters");
            } else if (conversionChoice.equals("kilometers")) {
                System.out.println(distance + " inches = " + (distance * 0.0000254) + " kilometers");
            } else {
                System.out.println("Invalid choice!");
            }
        } else if (unit.equals("millimeters")) {
            if (conversionChoice.equals("inches")) {
                System.out.println(distance + " millimeters = " + (distance / 25.4) + " inches");
            } else if (conversionChoice.equals("kilometers")) {
                System.out.println(distance + " millimeters = " + (distance / 1_000_000) + " kilometers");
            } else {
                System.out.println("Invalid choice!");
            }
        } else if (unit.equals("kilometers")) {
            if (conversionChoice.equals("inches")) {
                System.out.println(distance + " kilometers = " + (distance * 39_370.1) + " inches");
            } else if (conversionChoice.equals("millimeters")) {
                System.out.println(distance + " kilometers = " + (distance * 1_000_000) + " millimeters");
            } else {
                System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Invalid unit!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        int distance = scanner.nextInt();
        System.out.print("Enter the unit (inches, millimeters, kilometers): ");
        String unit = scanner.next();
        Distance dist = new Distance(distance, unit);
        dist.convertDistance();
    }
}
