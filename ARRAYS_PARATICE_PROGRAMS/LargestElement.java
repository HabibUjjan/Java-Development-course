class LargestElement {
    public static void main(String[] args) {
        int[] array = {5, 1, 2, 7, 6};
        int number = 3;  
        for (int i = 0; i < array .length; i++) {
            for (int j = i + 1; j < array .length; j++) {
                if (array[i] < array[j]) {
                    int temp = array [i];
                    array [i] = array [j];
                    array [j] = temp;
                }
            }
        }
        System.out.println(number + "The Largest Element is: " + array [number - 1]);
    }
}
