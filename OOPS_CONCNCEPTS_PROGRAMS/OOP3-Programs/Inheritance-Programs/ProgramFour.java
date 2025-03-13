class Shape {
    public void getPerimeter() {
        System.out.println("Perimeter not defined for generic shape.");
    }
    public void getArea() {
        System.out.println("Area not defined for generic shape.");
    }
}
class Circle extends Shape {
    double radius = 5;
    @Override
    public void getPerimeter() {
        double perimeter = 2 * 3 * radius; 
        System.out.println("Perimeter of the circle: " + perimeter);
    }
    @Override
    public void getArea() {
        double area = 3 * radius * radius; 
        System.out.println("Area of the circle: " + area);
    }
}
class ProgramFour{
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.getPerimeter();
        myCircle.getArea();
    }
}
