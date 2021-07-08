
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int total = 0;
        int greatest = 0;
        String longest = "";

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] array = input.split(",");
            
            sum += Integer.valueOf(array[1]);
            
            if (array[0].length() > greatest) {
                greatest = array[0].length();
                longest = array[0];
            }
            
            total++;
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + 1.0 * sum / total);
        
        
    }
}
