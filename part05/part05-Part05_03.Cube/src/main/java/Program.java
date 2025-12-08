
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.print("Enter the length of your cube: ");
        int input = Integer.valueOf(scanner.nextLine());

        Cube cube = new Cube(input);

        System.out.print("The volume of your cube is : ");
        System.out.println(cube.volume());

        System.out.println(cube);


    }
}
