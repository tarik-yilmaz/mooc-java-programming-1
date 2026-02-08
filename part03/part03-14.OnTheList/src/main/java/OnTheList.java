
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        // Ask the user for input
        System.out.print("Search for? ");
        
        // Read the input and print a newline
        String search = scanner.nextLine();
        System.out.println();

        // Boolean flag to check if the search is in the list
        boolean found = list.contains(search);

        // 
        if (found) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }


    }
}
