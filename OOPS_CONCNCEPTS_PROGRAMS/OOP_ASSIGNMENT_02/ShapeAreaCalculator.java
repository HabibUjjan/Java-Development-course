import java.util.Scanner;
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.print("Enter the number corresponding to your choice: ");
        int shapeChoice = sc.nextInt();
        double area = 0;
        switch(shapeChoice) {
            case 1: 
                System.out.print("Enter length of rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = sc.nextDouble();
                area = length * width;
                System.out.println("The area of the rectangle is: " + area);
                break;
                
            case 2:
                System.out.print("Enter base of triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + area);
                break;
                
            default:
                System.out.println("Invalid choice. Please choose 1 for rectangle or 2 for triangle");
        }

        System.out.println("********Let's create a clock now********");
        System.out.print("Enter the hour: ");
        int hour = sc.nextInt();
        System.out.print("Is it AM or PM? (Enter true for AM, false for PM): ");
        boolean isAM = sc.nextBoolean();
        Clock clock = new Clock(hour, isAM);
        clock.displayTime(); 
    }
}
