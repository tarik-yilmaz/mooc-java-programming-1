import java.util.ArrayList;
import java.util.Random;


public class JokeManager {
    private ArrayList<String> jokes;

    // Initialize the constructor with the ArrayList
    public JokeManager() {
        
        this.jokes = new ArrayList<>();
    }

    // Add jokes from the parameter to the list
    public void addJoke(String joke) {

        this.jokes.add(joke);
    }

    // Take a random object from the list using the Random class
    public String drawJoke() {

        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random rand = new Random();
        int index = rand.nextInt(this.jokes.size());
        return this.jokes.get(index);

    }

    // Print all objects in the list
    public void printJokes() {

        for (String joke : jokes) {
        System.out.println(joke);
        }

    }
}
