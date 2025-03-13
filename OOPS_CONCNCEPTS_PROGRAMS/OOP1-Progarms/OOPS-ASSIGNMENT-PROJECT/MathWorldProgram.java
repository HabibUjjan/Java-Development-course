import java.util.Scanner;
class MathWorldProgram {
	public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********Welcome to The Math World**********");
        System.out.println("1.  Check even odd");
        System.out.println("2.  Generate Table");
        System.out.println("3.  Calculate Factorial");
        System.out.println("4.  Reverse the Number");
        System.out.println("5.  Check perfect Number");
        System.out.println("6.  Check Armstrong number");
        System.out.println("7.  Print all the factors");
        System.out.println("8.  Generate Pascal Triangle");
        System.out.println("9.  Check palindrome number");
        System.out.println("10. Generate a Diamond Pattern");
        System.out.println("11. Calculate square of number");

        System.out.print("Input your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            checkEvenOdd(scanner);
        } else if (choice == 2) {
            generateTable(scanner);
        } else if (choice == 3) {
            calculateFactorial(scanner);
        } else if (choice == 4) {
            reverseNumber(scanner);
        } else if (choice == 5) {
            checkPerfectNumber(scanner);
        } else if (choice == 6) {
            checkArmstrongNumber(scanner);
        } else if (choice == 7) {
            printAllFactors(scanner);
        } else if (choice == 8) {
            generatePascalTriangle(scanner);
        } else if (choice == 9) {
            checkPalindrome(scanner);
        } else if (choice == 10) {
            generateDiamondPattern(scanner);
        } else if (choice == 11) {
            calculateSquare(scanner);
        } else {
            System.out.println("Invalid choice! Please choose a valid option.");
        }
  
        System.out.println("Do you want to perform any other operation? (YES/NO): ");
        String continueChoice = scanner.next();
        if (continueChoice.equalsIgnoreCase("YES")) {
            menu(); 
        } else {
            System.out.println("Thanks for using our service!"); // End message
        }
    }

    public void checkEvenOdd(Scanner scanner) {
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even Number");
        } else {
            System.out.println(number + " is an Odd Number");
        }
    }

   
    public void generateTable(Scanner scanner) {
        System.out.print("Enter a Number for Table: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    
    public void calculateFactorial(Scanner scanner) {
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    
    public void reverseNumber(Scanner scanner) {
        System.out.print("Enter any Number: ");
        int number = scanner.nextInt();
        int reverse = 0;
        int originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println("The reverse of " + originalNumber + " is " + reverse);
    }

    public void checkPerfectNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

   
    public void checkArmstrongNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0, originalNumber = number;
        int digits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }

    
    public void printAllFactors(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    
    public void generatePascalTriangle(Scanner scanner) {
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public void checkPalindrome(Scanner scanner) {
        System.out.print("Enter any Number: ");
        int number = scanner.nextInt();
        int reverse = 0, originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }

   
    public void generateDiamondPattern(Scanner scanner) {
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int rows = scanner.nextInt();
       
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void calculateSquare(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The square of " + number + " is " + (number * number));
    }

    public static void main(String[] args) {
        MathWorldProgram maths = new MathWorldProgram(); 
        maths.menu();
    }
}

