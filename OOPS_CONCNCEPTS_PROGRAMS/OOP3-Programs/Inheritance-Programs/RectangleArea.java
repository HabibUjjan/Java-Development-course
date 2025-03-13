import java.util.Scanner;
class Shape {
    public double getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    public double width;
    public double height;
    @Override
    public double getArea() {
        return width * height;
    }
}
public class RectangleArea {
    public static void main(String[] args) {
        Scanner s = new s(System.in);

        System.out.println("Enter the width of the rectangle:");
        double width = s.nextDouble();

        System.out.println("Enter the height of the rectangle:");
        double height = s.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.width = width;
        rectangle.height = height;
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
