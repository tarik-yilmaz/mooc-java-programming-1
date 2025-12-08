
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");

        String firstValue = scan.nextLine();

        System.out.println("Give an integer: ");

        int secondValue = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double: ");

        double thirdValue = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean: ");

        boolean fourthValue = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + firstValue);
        System.out.println("You gave the integer " + secondValue);
        System.out.println("You gave the double " + thirdValue);
        System.out.println("You gave the boolean " + fourthValue);
    }
}
