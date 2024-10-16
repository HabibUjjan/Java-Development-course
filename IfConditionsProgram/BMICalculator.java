import java.util.Scanner;
class BMICalculator{
        public static void main(String Args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Weight in KG: ");
        int weight = scan.nextInt();
        System.out.print("Enter Your Height in Meters: ");
        int height = scan.nextInt();
        int bmi = weight / (height * height);
        System.out.println("Your Body Mass Index: "+ bmi);
        if(bmi < 18.5){
        System.out.println("Underweight");
        }else if (bmi < 25) {
        System.out.println("Normal");
        }else if (bmi < 30) {
        System.out.println("Overweight");
        } else {
        System.out.println("Obese");
        }
     }
}