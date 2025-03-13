import java.util.Scanner;
public class Multiples {
    Multiples(int number) {
        int count = 1;
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(number * count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        Multiples multiples = new Multiples(number);  
    }
}
