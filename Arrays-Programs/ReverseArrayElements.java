import java.util.Scanner;
class ReverseArrayElements {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Reversed elements in the array are:");
        for (int i = 0; i < size; i++) {
            int num = array[i]; 
            int reversed = 0;    
            while (num != 0) {
                int digit = num % 10; 
                reversed = reversed * 10 + digit; 
                num = num / 10;
            }
            System.out.println(reversed);
        }
    }
}
