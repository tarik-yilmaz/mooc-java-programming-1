
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Added indexes for looping through the desired indices
        int start = 0;
        int end = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.print("From where? ");
                start = Integer.valueOf(scanner.nextLine());
                System.out.print("To where? ");
                end = Integer.valueOf(scanner.nextLine());
                
                break;
            }

            numbers.add(number);
        }

        // for loop for iterating through the ArrayList numbers from start to end
        for (int i  = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }

        // Alternatively
        // while (start <= end) {
        //     System.out.println(numbers.get(start));
        //     start++;
        // }

    }
}
