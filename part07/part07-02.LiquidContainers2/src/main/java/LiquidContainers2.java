
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // For the test of part 1
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());
            System.out.print("> ");

            
            String input = scan.nextLine();
            
            if (input.toLowerCase().equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            
            String command = parts[0].toLowerCase();
            
            int amount = 0;

            if (parts.length > 1) {
                amount = Integer.valueOf(parts[1]);
            }

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                firstContainer.add(amount);
            } 
            
            if (command.equals("move")) {

                if (amount > firstContainer.getAmount()) {
                    amount = firstContainer.getAmount();
                }

                firstContainer.remove(amount);
                secondContainer.add(amount);
            } 
            
            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }

}
