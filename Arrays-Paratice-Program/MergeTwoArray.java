class MergeTwoArray{
    public static void main(String[] args) {
        int[] array1 = {11, 3, 51, 17};
        int[] array2 = {2, 11, 6, 21};
        int a = array1.length;
        int b = array2.length;
        int c = a + b;
        int[] array3 = new int[c];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[a + i] = array2[i];
        }
        System.out.print("The merged Array is: ");
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + " ");
        }
    }
}
