public class DivideByZeroProgram{
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}
