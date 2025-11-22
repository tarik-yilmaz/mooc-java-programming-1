
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int giftValue = Integer.valueOf(scan.nextLine());

        double tax = 0;

        if (giftValue >= 5000 && giftValue <= 25000) {
            tax = (giftValue - 5000) * 0.08 + 100;
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            tax = (giftValue - 25000) * 0.10 + 1700;
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 55000 && giftValue < 200000) {
            tax = (giftValue - 55000) * 0.12 + 4700;
            System.out.println("Tax: " + tax);
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            tax = (giftValue - 200000) * 0.15 + 22100;
            System.out.println("Tax: " + tax);
        } else if (giftValue > 1000000) {
            tax = (giftValue - 1000000) * 0.17 + 142100;
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
