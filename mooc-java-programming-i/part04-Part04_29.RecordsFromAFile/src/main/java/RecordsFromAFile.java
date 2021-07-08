
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try (Scanner f = new Scanner(Paths.get(fileName))) {
            while (f.hasNextLine()) {
                String line = f.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] items = line.split(",");
                System.out.println(items[0] + ", age: " + items[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
