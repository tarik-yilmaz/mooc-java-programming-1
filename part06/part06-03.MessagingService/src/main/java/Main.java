
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService service = new MessagingService();

        Message msg = new Message("Tarik", "Hello there");

        service.add(msg);

        for (Message m : service.getMessages()) {
            System.out.println(m);
        }
    }
}
