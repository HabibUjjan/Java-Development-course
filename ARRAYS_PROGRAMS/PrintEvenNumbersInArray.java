import java.util.Scanner;
class PrintEvenNumbersInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Even numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) { 
                System.out.println(array[i]);
            }
        }
    }
}
