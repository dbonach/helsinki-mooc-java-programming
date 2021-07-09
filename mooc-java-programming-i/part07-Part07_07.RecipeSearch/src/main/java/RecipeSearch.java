
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeBook book = new RecipeBook();
        
        UserInterface i = new UserInterface(scanner, book);
        
        i.start();
    }

}
