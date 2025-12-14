import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary object;

    // Constructor initializes scanner and object
    public TextUI(Scanner scanner, SimpleDictionary object) {
        this.scanner = scanner;
        this.object = object;
    }

    // Starting point of the method
    // start() loops until the user enters "end"
    public void start() {
        while (true) {
            System.out.print("Command: "); 
            
            String input = scanner.nextLine();

            // Ending condition of the loop
            if (input.toLowerCase().equals("end")) {
                System.out.println("Bye bye!");
                break;

            // This block adds a word and a translation to the object SimpleDictionary
            } else if (input.toLowerCase().equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                this.object.add(word, translation);

            // This block searches trough the object and return either the translation
            // or the message that the translation was not found
            }  else if (input.toLowerCase().equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                
                String translation = object.translate(toBeTranslated);

                if (translation == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }

            // In all other cases, print "Unknown command"
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
