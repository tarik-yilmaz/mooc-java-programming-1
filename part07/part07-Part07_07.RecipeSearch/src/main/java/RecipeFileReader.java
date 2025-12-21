import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class RecipeFileReader {

    public List<Recipe> readFromFile(String fileName) throws IOException {
        List<Recipe> recipes = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine().trim();

                // If rows are empty contine
                if (name.isEmpty()) {
                    continue;
                }

                // Next row is cooking time
                if (!fileScanner.hasNextLine()) {
                    break;
                }

                int cookingTime = Integer.parseInt(fileScanner.nextLine().trim());
                List<String> ingredients = new ArrayList<>();

                // Read ingredients till EOF or endline
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine().trim();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return recipes;
    }
}
