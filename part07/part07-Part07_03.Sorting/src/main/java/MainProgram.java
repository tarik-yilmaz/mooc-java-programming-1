import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }    
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;        
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        
        // Test for printing the smallest index
        int[] array = {6, 5, 8, 7, 11};

        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));

        // Test for printing the smallest index specified
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        // Test for swapping numbers
        int[] numbersToSwap = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbersToSwap));

        MainProgram.swap(numbersToSwap, 1, 0);
        System.out.println(Arrays.toString(numbersToSwap));

        MainProgram.swap(numbersToSwap, 0, 3);
        System.out.println(Arrays.toString(numbersToSwap));

        int[] numbersToSort = {8, 3, 7, 9, 1, 2, 4};
        System.out.println();
        System.out.println("Array before sorting: ");
        printArray(numbersToSort);
        MainProgram.sort(numbersToSort);
        System.out.println();
        System.out.println("Array after sorting: ");
        printArray(numbersToSort);
    }

}
