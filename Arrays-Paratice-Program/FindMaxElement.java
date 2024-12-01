class FindMaxElement {
    public static void main(String[] args) {
        int[] array = {21, 41, 77, 36, 3, 1};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The Maximum Element Of Array is: " + max);
    }
}
