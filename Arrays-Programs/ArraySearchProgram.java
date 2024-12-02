class ArraySearchProgram{
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int searchNumber = 50;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchNumber + " is found in the array");
        } else {
            System.out.println(searchNumber + " is not found in the array");
        }
    }
}
