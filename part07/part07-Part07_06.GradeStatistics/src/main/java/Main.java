
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        // Initializes and starts the scanning of inputs
        Averages averages = new Averages();
        averages.inputReader();
        

        // saves the outcome of the method for the output of all average
        double avg = averages.averageCalculator();
        System.out.println("Point average (all): " + avg);

        // saves the outcome of averagePassing() and implements an if else
        // statement for the desired messages
        double passedAverages = averages.averagePassing();
        if (passedAverages < 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passedAverages);
        }
        
        double passed = averages.passPercentage();

        System.out.println("Pass percentage: " + passed);
        
        System.out.println("Grade distribution: ");
        averages.gradeDistribution();
    }
}
