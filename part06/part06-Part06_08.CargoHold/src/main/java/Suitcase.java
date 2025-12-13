import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    // Calcuclate the sum of total weight of the items list
    // and returns it
    public int totalWeight() {
        int sum = 0;

        for (Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }

    // Add item to the items array only if the total weight plus the weight of the
    // item from the parameter doesn't exceed the maxWeight of the suitcase
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {

        if (items.size() == 0) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + this.totalWeight() + " kg)";    
        } else {
            return items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);

        for (Item i : items) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }

        return heaviest;
    }
}
