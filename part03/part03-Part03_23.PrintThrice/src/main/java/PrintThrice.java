
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Give a word: ");

        String input = scanner.nextLine();
        int times = 3;

        while (times > 0) {
            System.out.print(input);
            times--;
        }
    }
}
