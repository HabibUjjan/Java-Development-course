class BinarySearchProgram{
    public static void main(String[] args) {
        int[] myArray = {7, 2, 9, 4, 8};
        int num = 9;
        int firstIndex = 0;
        int lastIndex = myArray.length - 1;
        boolean found = false;
        for (int midIndex = (firstIndex + lastIndex) / 2; firstIndex <= lastIndex; midIndex = (firstIndex + lastIndex) / 2) {
            if (myArray[midIndex] == num) {
                System.out.println("The Index found in Array is: " + midIndex);
                found = true;
                break;
            } else if (myArray[midIndex] < num) {
                firstIndex = midIndex + 1; 
            } else {
                lastIndex = midIndex - 1; 
            }
        }

        if (!found) {
            System.out.println("The Element is not found in the array");
        }
    }
}
