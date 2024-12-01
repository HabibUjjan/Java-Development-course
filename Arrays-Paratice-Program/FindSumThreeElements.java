class FindSumThreeElements{
    public static void main(String[] args) {
        int[] arr = {12, 4, 1, 6, 3, 2};
        int target = 213;
        boolean found = false;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No three elements found with the sum equal to " + target);
        }
    }
}
