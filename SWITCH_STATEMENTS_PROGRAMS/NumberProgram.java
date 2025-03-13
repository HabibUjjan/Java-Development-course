import java.util.Scanner;
class NumberProgram{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number From 1 To 3:");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("You Enter a 1");
                break;
            case 2:
                System.out.println("You Enter a 2");
                break;
            case 3:
                System.out.println("You Enter a 3");
                break;
            default:
                System.out.println("You Enter a Invalid number you Enter from 1 to 3");
        }
    }
}
