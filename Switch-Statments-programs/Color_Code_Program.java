import java.util.Scanner;
class Color_Code_Program{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color code 1 TO 5:");
        int code = scanner.nextInt();
        switch (code) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Green");
                break;
            case 3:
                System.out.println("Blue");
                break;
            case 4:
                System.out.println("Yellow");
                break;
            case 5:
                System.out.println("Purple");
                break;
            default:
                System.out.println("Invalid code");
        }
    }
}
