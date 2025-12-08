public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Money sum = a.plus(b);
        System.out.println("a + b = " + sum);

        Money diff = a.minus(b);
        System.out.println("a - b = " + diff);

        Money diff2 = b.minus(a);
        System.out.println("b - a = " + diff2 + " (sollte 0.00e sein)");

        System.out.println("b < a ? " + b.lessThan(a));
        System.out.println("a < b ? " + a.lessThan(b));
    }
}
