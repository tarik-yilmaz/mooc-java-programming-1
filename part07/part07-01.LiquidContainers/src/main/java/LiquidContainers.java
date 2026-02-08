
import java.util.Scanner;

public class LiquidContainers {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
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
                firstContainer += amount;
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
            } 
            
            if (command.equals("move")) {
                if (amount > firstContainer) {
                    amount = firstContainer;
                }

                int space = 100 - secondContainer;

                if (amount > space) {
                    amount = space;
                }
                
                firstContainer -= amount;
                secondContainer += amount;
            } 
            
            if (command.equals("remove")) {
                secondContainer -= amount;
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }
        }
    }

}
