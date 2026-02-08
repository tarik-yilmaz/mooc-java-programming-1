
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard PaulCard = new PaymentCard(20);
        PaymentCard MattCard = new PaymentCard(30);

        PaulCard.eatHeartily();
        MattCard.eatAffordably();
        System.out.println("Paul: " + PaulCard.toString());
        System.out.println("Matt: " + MattCard.toString());

        PaulCard.addMoney(20);
        MattCard.eatHeartily();
        System.out.println("Paul: " + PaulCard.toString());
        System.out.println("Matt: " + MattCard.toString());

        PaulCard.eatAffordably();
        PaulCard.eatAffordably();
        MattCard.addMoney(50);
        System.out.println("Paul: " + PaulCard.toString());
        System.out.println("Matt: " + MattCard.toString());
    }
}