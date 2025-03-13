class PascalTriangleProgram{
    public static void main(String Args[]) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int num = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " "); 
                num = num * (i - j) / (j + 1);
            }
            System.out.println(); 
        }
    }
}
