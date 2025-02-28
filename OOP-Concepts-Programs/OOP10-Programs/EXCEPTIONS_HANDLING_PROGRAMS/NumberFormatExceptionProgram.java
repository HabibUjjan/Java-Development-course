public class NumberFormatExceptionProgram {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        }
    }
}
