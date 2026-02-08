import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    // Initialize the class TodoList as a object with the same name
    // and the class Scanner
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    // Method for starting the interface
    public void start() {
        while (true) {
            System.out.print("Command: ");

            String input = scanner.nextLine();

            if (input.toLowerCase().equals("stop")) {
                break;
            } 
            else if (input.toLowerCase().equals("add")) {
                System.out.print("To add: ");
                String addTask = scanner.nextLine();

                todoList.add(addTask);
            }
            else if (input.toLowerCase().equals("list")) {
                todoList.print();
            } 
            else if (input.toLowerCase().equals("remove")) {
                System.out.print("Which one is removed? ");

                int removed = Integer.valueOf(scanner.nextLine());

                todoList.remove(removed);
            }
        }
    }
}
