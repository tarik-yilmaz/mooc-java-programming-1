import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        RecipeFileReader reader = new RecipeFileReader();
        List<Recipe> recipes;

        try {
            recipes = reader.readFromFile(fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("Error: invalid cooking time in file.");
            return;
        }

        UserInterface ui = new UserInterface(scanner, recipes);
        ui.start();
    }
}
