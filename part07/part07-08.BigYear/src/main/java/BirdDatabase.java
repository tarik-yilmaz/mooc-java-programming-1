import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    private Bird find(String name) {
        for (Bird b : birds) {
            if (b.matches(name)) {
                return b;
            }
        }
        return null;
    }

    public void add(String name, String latinName) {
        if (find(name) != null) {
            return;
        }
        birds.add(new Bird(name, latinName));
    }

    public void observation(String name) {
        Bird bird = find(name);

        if (bird == null) {
            System.out.println("Not a bird!");
            return;
        }
        bird.observed();
    }

    public void printAll() {
        for (Bird b : birds) {
            System.out.println(b);
        }
    }

    public void printOne(String name) {
        Bird bird = find(name);
        if (bird == null) {
            System.out.println("Not a bird!");
            return;
        }
        System.out.println(bird);
    }

}
