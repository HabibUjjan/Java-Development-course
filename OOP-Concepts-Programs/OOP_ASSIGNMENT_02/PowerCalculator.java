public class PowerCalculator {
     double power(double n, int p) {
        double result = 1;
        for (int i = 1; i <= p; i++) {
            result = result * n;
        }
        return result;
    }
    int power(int n, int p) {
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result = result * n;
        }
        return result;
    }

    double power(double n) {
        return power(n, 2);
    }
    public int power(int n) {
        return power(n, 2);
    }

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        System.out.println("3.0 raised to the power 2: " + calculator.power(3.0));
        System.out.println("2.5 raised to the power 3: " + calculator.power(2.5, 3));  
        System.out.println("4 raised to the power 2: " + calculator.power(4));  
        System.out.println("5 raised to the power 3: " + calculator.power(5, 3));  
    }
}
