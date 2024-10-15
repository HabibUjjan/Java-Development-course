import java.util.Scanner;
class GradeCalculatorProgram{
    public static void main(String Args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Yours Marks: ");
    int marks = scan.nextInt();
    if(marks >= 90){
           System.out.println("Grade: A");
    }else if(marks >= 75){
           System.out.println("Grade: B");
    }else if(marks >= 60){
           System.out.println("Grade: C");
    }else{
           System.out.println("Grade: Fail");
       }

    }

}