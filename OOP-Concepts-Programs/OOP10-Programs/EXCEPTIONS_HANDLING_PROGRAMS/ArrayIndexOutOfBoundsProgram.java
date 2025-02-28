public class ArrayIndexOutOfBoundsProgram {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
        }
    }
}
