/**
 *
 * @author dbonach
 */
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int seconds;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int seconds, ArrayList<String> ingredients) {
        this.name = name;
        this.seconds = seconds;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getSeconds() {
        return seconds;
    }
    
    public boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }

    @Override
    public String toString() {
        String recipe = this.name + '\n' + this.seconds;
        
        for (String ingredient : ingredients) {
            recipe += '\n' + ingredient;
        }
        
        return recipe;
    }
    
    
}
