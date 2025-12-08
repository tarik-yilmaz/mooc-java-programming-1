
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account tariksAccount = new Account("Tarik's account", 100.0);

        tariksAccount.deposit(20.0);

        System.out.println(tariksAccount.toString());
    }
}
