
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int total = 0;
        
        try (Scanner f = new Scanner(Paths.get(file))) {
            while (f.hasNextLine()) {
                int n = Integer.valueOf(f.nextLine());
                
                if(n >= lowerBound && n <= upperBound) {
                    total++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Numbers: " + total);
    }

}
