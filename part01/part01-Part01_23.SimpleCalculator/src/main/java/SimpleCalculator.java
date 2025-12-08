
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        int addSum = firstNumber + secondNumber;
        int subSum = firstNumber - secondNumber;
        int multSum = firstNumber * secondNumber;
        double divSum = (double) firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + addSum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subSum);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multSum);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divSum);
    }
}
