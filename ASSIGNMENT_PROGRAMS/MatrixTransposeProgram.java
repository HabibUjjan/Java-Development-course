import java.util.*;

public class MatrixTransposeProgram{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = matrix.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) { 
            for (int j = 0; j < rows; j++) { 
                ArrayList<Integer> row = matrix.get(j);
                System.out.print(row.get(i) + " "); 
            }
            System.out.println();
        }
    }
}
