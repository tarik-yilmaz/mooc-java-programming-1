
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables for calculations and output
        String longestName = "";
        int sumOfYears = 0;
        int counter = 0;

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }

            // Split strings separated with a comma
            String[] pieces = input.split(",");
            
            // if the length of the longestName is smaller than the string
            // in pieces at index 0, assign pieces to longestName
            if (longestName.length() < pieces[0].length()) {
                longestName  = pieces[0];
            }

            // Add the integer value of pieces to sumOfYears
            // Increment the counter
            sumOfYears += Integer.valueOf(pieces[1]);
            counter++;
        }

        // Calculate the average with casting to a double
        double average = (double) sumOfYears / counter;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
