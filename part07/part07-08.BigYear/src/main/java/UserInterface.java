import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdDatabase database;

    public UserInterface(Scanner scanner, BirdDatabase database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().toLowerCase();

            if (command.equals("quit")) {
                break;

            } else if (command.equals("add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();

                database.add(name, latin);

            } else if (command.equals("observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                database.observation(name);

            } else if (command.equals("all")) {
                database.printAll();

            } else if (command.equals("one")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                database.printOne(name);

            }
        }
    }
}
