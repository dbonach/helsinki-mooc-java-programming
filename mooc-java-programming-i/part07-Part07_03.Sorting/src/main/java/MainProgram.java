import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        for (int i = 1 + index; i < table.length; i++) {
            if (table[i] < table[index]) {
                index = i;
            }
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }
    
    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));
        while (index < array.length - 1) {
            int indexSmallest = indexOfSmallestFrom(array, index);
            swap(array, index, indexSmallest);
            System.out.println(Arrays.toString(array));
            index++;
        }
    }
}
