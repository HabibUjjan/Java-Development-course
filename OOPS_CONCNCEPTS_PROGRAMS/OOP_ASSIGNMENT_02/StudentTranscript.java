import java.util.Scanner;
class Transcript {
    double[] semesterGPAs;
    int numberOfSemesters;

    Transcript(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
        this.semesterGPAs = new double[numberOfSemesters];
    }

    void inputGPAs() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfSemesters; i++) {
            System.out.print("Enter GPA for Semester " + (i + 1) + ": ");
            semesterGPAs[i] = scanner.nextDouble();
        }
    }
        void displayInformation() {
        for (int i = 0; i < numberOfSemesters; i++) {
            System.out.println("Semester " + (i + 1) + " GPA: " + semesterGPAs[i]);
        }
    }

    double calculateCumulativeGPA() {
        double totalGPA = 0;
        for (int i = 0; i < numberOfSemesters; i++) {
            totalGPA += semesterGPAs[i];
        }
        return totalGPA / numberOfSemesters;
    }
    void displayCumulativeGPA() {
        System.out.println("Cumulative GPA: " + calculateCumulativeGPA());
    }
}

public class StudentTranscript {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of semesters: ");
        int numberOfSemesters = scanner.nextInt();
        Transcript transcript = new Transcript(numberOfSemesters);
        transcript.inputGPAs();
	System.out.println();
        System.out.println("**********Semester GPA Information**********");
        transcript.displayInformation();
        transcript.displayCumulativeGPA();
    }
}
