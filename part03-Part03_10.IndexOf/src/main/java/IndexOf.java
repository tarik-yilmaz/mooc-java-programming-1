
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        // Ask the user for input and read it in the variable search
        // and create a variable for the index
        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());
        int index = 0;
        // implement here finding the indices of a number
        
        // Iterate with a for loop through the list
        // and if the number is the same as search, assign it to search
        // and break out of the loop
        for (int i = 0; i < list.size(); i++) {
            if (search == list.get(i)) {
                index = i;
                System.out.println("\n" + search + " is at index " + index);
            }
        }

        // Output the finding
    }
}
