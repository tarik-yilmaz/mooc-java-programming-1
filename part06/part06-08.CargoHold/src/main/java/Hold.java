import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public int currentWeight() {
        int sum = 0;
        for (Suitcase s : suitcases) {
            sum += s.totalWeight();
        }
        return sum;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight() + suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases " + "(" + this.currentWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }
}
