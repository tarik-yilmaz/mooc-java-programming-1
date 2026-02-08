import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }


    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        // Test of int[] sort
        System.out.println("int[] Before: " + Arrays.toString(array));
        sort(array);
        System.out.println("int[] After: " + Arrays.toString(array));

        // Test of String[] sort
        String[] names = {"Tarik", "Solid Snake", "Adam", "Eva", "Darwin"};
        System.out.println("\nString[] Before: " + Arrays.toString(names));
        sort(names);
        System.out.println("String[] After: " + Arrays.toString(names));

        // Test of ArrayList<Integer> sort
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(44);
        list.add(8);
        list.add(12);

        System.out.println("\nArrayList<Integer> Before: " + list);
        sortIntegers(list);
        System.out.println("ArrayList<Integer> After: " + list);

        // Test of ArrayList<String> sort
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Mango");
        words.add("Maracuja");
        words.add("Kiwi");
        words.add("Banana");

        System.out.println("\nArrayList<String> Before: " + words);
        sortStrings(words);
        System.out.println("ArrayList<String> After: " + words);
    }

}
