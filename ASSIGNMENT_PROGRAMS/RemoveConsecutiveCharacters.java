import java.util.*;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        System.out.print("Enter the number of consecutive occurrences to remove: ");
        int occurance = scanner.nextInt();
        System.out.println(removeConsecutiveCharacters(s, occurance));
    }
    public static String removeConsecutiveCharacters(String s, int occurance) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++; 
            } else {
                count = 1;
            }
            if (count != occurance) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
