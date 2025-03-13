public class ArraySum {
    int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }
    
    int sum(int[] arr, char type) {
        int total = 0;
        if (type == 'E') {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    total = total + arr[i];
                }
            }
        } else if (type == 'O') {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    total = total + arr[i];
                }
            }
        } else {
            return 0; 
        }
        
        return total;
    }

    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 
        System.out.println("Sum of all elements: " + arraySum.sum(arr));
       
        System.out.println("Sum of even elements: " + arraySum.sum(arr, 'E'));
        
        System.out.println("Sum of odd elements: " + arraySum.sum(arr, 'O'));
 
        System.out.println("Sum with invalid character: " + arraySum.sum(arr, 'X'));
    }
}
