
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        
        // Test sort(int[] array)
        int[] numbers = {3, 1, 5, 99, 3, 12};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("");

        
        // Test sort(String[] array)
        String[] array = {"na", "nb", "b", "a"};
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");


        // Test sortIntegers(...)
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(410);
        list.add(250);
        list.add(144);
        list.add(967);
        list.add(289);
        list.add(315);
        
        sortIntegers(list);
        
        list.forEach((i) -> {
            System.out.print(i);
            System.out.print(", ");
        });
        System.out.println("");
        System.out.println("");
        
        
        // Test sortStrings(ArrayList<String> strings)
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Srilanka");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Japan");
        
        sortStrings(countries);
        
        countries.forEach((c) -> {
            System.out.print(c);
            System.out.print(", ");
        });
    }
    
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
}
