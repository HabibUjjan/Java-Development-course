class LargestValue {
    public static void main(String[] Args) { 
        int[] h = {10, 100, 4501, 2813, 345642};
        int large = h[0]; 

        for (int i = 1; i < h.length; i++) {
            if (h[i] > large) { 
                large = h[i];
            }
        }

        System.out.println("The Largest Element of Array is: " + large);
    }
}
