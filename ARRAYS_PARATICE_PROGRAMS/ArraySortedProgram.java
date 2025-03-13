class ArraySortedProgram{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
