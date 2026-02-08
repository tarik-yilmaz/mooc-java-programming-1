
public class Main {

    public static void main(String[] args) {
        // use this main method to try out your classes!

        Gift toy = new Gift("Wooden train set", 3);

        Package gifts = new Package();
        gifts.addGift(toy);

        System.out.println("Gift's name " + toy.getName());

        System.out.println(gifts.totalWeight());

    }
}
