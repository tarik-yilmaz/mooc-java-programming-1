import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> stack = new ArrayList<>();
        // Try out your class here
        Stack s = new Stack();

        System.out.println(s.isEmpty());
        System.out.println(s.values());
        
        s.add("First value");
        s.add("Second value");

        System.out.println(s.isEmpty());
        System.out.println(s.values());

        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

    }
}
