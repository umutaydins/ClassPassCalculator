import java.util.Scanner;

public class Main {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the Mathematics exam score: ");
            int mathScore = scanner.nextInt();

            System.out.print("Enter the Physics exam score: ");
            int physicsScore = scanner.nextInt();

            System.out.print("Enter the Chemistry exam score: ");
            int chemistryScore = scanner.nextInt();

            System.out.print("Enter the Turkish exam score: ");
            int turkishScore = scanner.nextInt();

            System.out.print("Enter the History exam score: ");
            int historyScore = scanner.nextInt();

            System.out.print("Enter the Music exam score: ");
            int musicScore = scanner.nextInt();

            scanner.close();

            // Calculate the total score
            int totalScore = mathScore + physicsScore + chemistryScore + turkishScore + historyScore + musicScore;

            // Calculate the average
            double average = totalScore / 6.0;

            System.out.println("Average: " + average);

            // Checking the class passing status using a ternary operator
            String classPassingStatus = (average >= 60) ? "Passed the Class" : "Failed the Class";
            System.out.println(classPassingStatus);
        }


}