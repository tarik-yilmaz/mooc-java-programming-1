
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            
            // .equals() checks if a specified string is in the object
            if (input.equals("")) {
                break;
            }

            // .split() splits the string with a regex into an array
            String[] piece = input.split(" ");

            // for loop to iterate through the piece-array and print
            // only the strings with "av" inside them
            for (int i = 0; i < piece.length; i++) {
                if (piece[i].contains("av")) {
                    System.out.println(piece[i]);
                }
            }
        }
    }
}
