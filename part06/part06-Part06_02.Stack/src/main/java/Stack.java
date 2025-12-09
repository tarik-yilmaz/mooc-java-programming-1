import java.util.ArrayList;

public class Stack {
    private  ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }



}
