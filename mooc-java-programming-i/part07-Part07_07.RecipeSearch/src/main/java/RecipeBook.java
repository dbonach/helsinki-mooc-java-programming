/**
 *
 * @author dbonach
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeBook {
    private ArrayList<Recipe> recipes;
    
    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }
    
    public void readRecipes(String file) {
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                int seconds = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    
                    if (ingredient.equals("")) {
                        break;
                    }
                    
                    ingredients.add(ingredient);
                }
               
                Recipe r = new Recipe(name, seconds, ingredients);
                recipes.add(r);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void printList() {
        this.printByName("");
    }
    
    public void printByName(String word) {
        System.out.println("Recipes:");
        
        for (Recipe r : this.recipes) {
            if(r.getName().contains(word)) {
                this.printRecipe(r);
            }
        }
    }

    public void printByTime(int maxTime) {
        System.out.println("Recipes:");
        
        for (Recipe r : this.recipes) {
            if (r.getSeconds() <= maxTime) {
                this.printRecipe(r);
            }
        }
    }
    
    public void printByIngredient(String ingredient) {
        System.out.println("Recipes:");
        
        for (Recipe r : this.recipes) {
            if (r.hasIngredient(ingredient)) {
                this.printRecipe(r);
            }
        }
    }
    
    public void printRecipe(Recipe r) {
        System.out.print(r.getName());
        System.out.println(", cooking time: " + r.getSeconds());
    }
}
