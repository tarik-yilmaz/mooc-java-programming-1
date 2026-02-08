import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private final List<Recipe> recipes;

    public UserInterface(Scanner scanner, List<Recipe> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        printCommands();

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine().trim().toLowerCase();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("list")) {
                System.out.println();
                System.out.println("Recipes:");
                printRecipeList(recipes);
                System.out.println();

            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine().trim();

                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getName().toLowerCase().contains(word.toLowerCase())) {
                        System.out.println(r);
                    }
                }
                System.out.println();

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine().trim());

                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.getCookingTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
                System.out.println();

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine().trim();

                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.hasIngredient(ingredient)) {
                        System.out.println(r);
                    }
                }
                System.out.println();

            }
        }
    }

    private void printCommands() {
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();
    }

    private void printRecipeList(List<Recipe> list) {
        for (Recipe r : list) {
            System.out.println(r);
        }
    }
}
