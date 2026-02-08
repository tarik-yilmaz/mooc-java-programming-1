import java.util.List;

public class Recipe {

    private final String name;
    private final int cookingTime;
    private final List<String> ingredients;

    public Recipe(String name, int cookingTime, List<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public boolean hasIngredient(String ingredient) {
        for (String i : ingredients) {
            if (i.toLowerCase().equals(ingredient.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}
