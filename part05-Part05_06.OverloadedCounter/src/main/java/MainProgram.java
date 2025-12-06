
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter(5);
        c.increase();
        c.increase(5);
        c.decrease();
        c.decrease(5);

        Counter c2 = new Counter();
        c2.increase();
        c2.increase(5);
        c2.decrease();
        c2.decrease(5);
    }
}
