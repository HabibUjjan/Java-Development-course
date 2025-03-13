class DuplicateFindProgram{
    public static void main(String[] args) {
        int[] array = {1 , 2 , 5 , 7 , 9 , 11 , 2 , 1};
        int duplicate = -1;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicate = array[i];
                    break;
                }
            }
            if (duplicate != -1) {
                break;
            }
        }
        if (duplicate != -1) {
            System.out.println("Our first Duplicate Element are: " + duplicate);
        } else {
            System.out.println("No Duplicate Elements in The Array");
        }
    }
}
