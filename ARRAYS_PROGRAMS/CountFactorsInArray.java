import java.util.Scanner;
class CountFactorsInArray {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int num = array[i]; 
            int count = 0; 
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++; 
                }
            }
            System.out.println("Number of factors of " + num + " is: " + count);
        }
    }
}
