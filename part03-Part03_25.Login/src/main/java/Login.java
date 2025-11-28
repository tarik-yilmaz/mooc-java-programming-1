
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // equals returns a boolean, so we can store it in a boolean variable
        // and we have a much cleaner if condition
        boolean alexLogin = username.equals("alex") && password.equals("sunshine");
        boolean emmaLogin = username.equals("emma") && password.equals("haskell");

        // If alexLogin or emmaLogin is true print the if block...
        if (alexLogin || emmaLogin) {
            System.out.println("You have successfully logged in!");     
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
