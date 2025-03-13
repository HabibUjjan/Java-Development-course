public class PattrenProgram1{
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= number; i++) {
            int firstColumn = i * i; 
            int secondColumn = i * i * i * i;
            System.out.println(firstColumn + "          " + secondColumn);
        }
    }
}
