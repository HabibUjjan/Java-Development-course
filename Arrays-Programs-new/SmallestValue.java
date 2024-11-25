class SmallestValue {
    public static void main(String[] Args) { 
        int[] b = {10, 100, 4501, 2813, 345642};
        int small = b[0]; 

        for (int i = 1; i < b.length; i++) {
            if (b[i] < small) { 
                small= b[i];
            }
        }

        System.out.println("The Smallest Element of Array is: " + small);
    }
}
