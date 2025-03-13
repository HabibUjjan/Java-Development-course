class CheckArraysEqual{
    public static void main(String[] args) {
        int[] array1 = {9, 11, 3, 4, 51};
        int[] array2 = {5, 7, 3, 4, 9};
        boolean areEqual = true;
        if (array1.length != array2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        if (areEqual) {
            System.out.println("The Arrays are equal");
        } else {
            System.out.println("The Arrays are not equal");
        }
    }
}

