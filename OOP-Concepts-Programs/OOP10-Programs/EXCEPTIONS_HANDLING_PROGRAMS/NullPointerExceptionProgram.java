public class NullPointerExceptionProgram {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Error: Trying to access method on a null object");
        }
    }
}
