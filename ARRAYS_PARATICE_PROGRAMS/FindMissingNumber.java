class FindMissingNumber {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr1 = {1, 2, 3, 4, 5}; 
        int[] arr2 = {2, 3, 1, 5};   
        int size = arr1.length; 
        for (int i = 0; i < size; i++) {
            sum = sum + arr1[i]; 
        }
        for (int i = 0; i < arr2.length; i++) {
            sum = sum - arr2[i]; 
        }
        System.out.println("The Missing Number in Array is: " + sum);
    }
}
