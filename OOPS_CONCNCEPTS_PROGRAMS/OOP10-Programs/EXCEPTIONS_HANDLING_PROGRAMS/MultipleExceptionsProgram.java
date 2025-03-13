public class MultipleExceptionsProgram{
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;
            String str = null;
            int length = str.length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException");
        }
    }
}
