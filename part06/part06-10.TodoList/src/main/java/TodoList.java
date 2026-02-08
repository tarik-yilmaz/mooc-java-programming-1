import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    // Initialize TodoList with a Array List
    public TodoList() {

        this.tasks = new ArrayList<String>();
    }

    // Add tasks to the Array from the method parameter
    public void add(String task) {
        tasks.add(task);
    }

    // print tasks
    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    // remove tasks associated with the index number provided as
    // a parameter from the method
    // note the -1 as the index is starting from 0, so we need to adjust that
    public void remove(int number) {
        tasks.remove(number - 1);
    }
}
