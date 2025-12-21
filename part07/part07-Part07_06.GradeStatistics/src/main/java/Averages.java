import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Averages {

    // private Variables, using List instead of directly using ArrayList
    // is always preferable, because List is an interface, so if you want
    // for e.g. a linked List, it is easier to change.
    private Scanner scanner;
    private List<Integer> numbers;

    // Initialize constructor with Scanner and ArrayList.
    public Averages() {
        this.scanner = new Scanner(System.in);
        this.numbers = new ArrayList<>();
    }

    // Method for reading input and saving the input in the list.
    // It reads only in the range of [0 - 100]
    public void inputReader() {
        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }

            if (input >= 0 && input <= 100) {
                numbers.add(input);
            }
        } 
    }

    // Method for calculating the average of all inputs
    public double averageCalculator() {
        
        if (numbers.isEmpty()) {
            return 0.0;
        }

        int sum = 0;

        for (int n : numbers) {
                sum += n;
        }

        return (double) sum / numbers.size();
    }
    
    // Method for calculating the average Passing points
    // Only calculates the average of all numbers equal or greater than 50
    // Counter was needed because in the list are also numbers lower than 50
    // so the size of the numbers list would be wrong
    public double averagePassing() {
        
        if (numbers.isEmpty()) {
            return 0.0;
        }

        int passedNumbers = 0;
        int counter = 0;

        for (int n : numbers) {
            if (n >= 50) {
                passedNumbers += n;
                counter++;
            }
        }

        if (counter == 0) {
            return -1;
        }

        return (double) passedNumbers / counter;
    }

    // This method calculates the percentage of all passing with the formula
    // 100 * passing / participants
    // Note that the counter is always incremented and the passed variable only in
    // case the points are over 50. The restriction for the case of excluding negative
    // numbers are provided in the method inputReader()
    public double passPercentage() {
        if (numbers.isEmpty()) {
            return 0.0;
        }

        int passed = 0;
        int counter = 0;

        for (int n : numbers) {
            if (n >= 50) {
                passed++;
                counter++;
            } else if (n >= 0) {
                counter++;
            }
        }

        return 100 * ((double) passed / counter);
    }

    // Method for printing the grade distribution (stars for every grade)
    // I use an array for simplicity and increment for every index the desired grade
    // Then we loop through the array using an inner loop:
    // For every index i, we loop j-times till j reaches the size of index i and
    // prints as many stars as the index contains.
    public void gradeDistribution() {
        if (numbers.isEmpty()) {
            return;
        }

        int[] stars = new int[6];

        for (int n : numbers) {

            if (n < 50) {
                stars[0]++;
            } else if (n < 60) {
                stars[1]++;
            } else if (n < 70) {
                stars[2]++;
            } else if (n < 80) {
                stars[3]++;
            } else if (n < 90) {
                stars[4]++;
            } else {
                stars[5]++;
            }
        } 
        
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < stars[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
