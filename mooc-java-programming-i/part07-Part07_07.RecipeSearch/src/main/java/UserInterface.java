/**
 *
 * @author dbonach
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner s;
    private RecipeBook book;
    
    public UserInterface(Scanner scanner, RecipeBook book) {
        this.s = scanner;
        this.book = book;
    }
    
    public void start() {
        System.out.print("File to read: ");
        String file = s.nextLine();
        System.out.println("");
        
        book.readRecipes(file);
        
        this.printCommands();
        
        while (true) {
            System.out.print("Enter command: ");
            String command = s.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("");
                book.printList();
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = s.nextLine();
                System.out.println("");
                book.printByName(word);
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(s.nextLine());
                System.out.println("");
                book.printByTime(maxTime);
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = s.nextLine();
                System.out.println("");
                book.printByIngredient(ingredient);
            }

            System.out.println("");
        }
    }
    
    public void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }
}
