/**
 *
 * @author dbonach
 */
import java.util.ArrayList;

public class BirdsDb {
    private ArrayList<Bird> birds;
    
    public BirdsDb() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird b) {
        birds.add(b);
    }
    
    public void addObservation(String name) {
        
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                b.addObservation();
                return;
            }
        }
        
        System.out.println("Not a bird!");
        
    }
    
    public void printAll() {
        for (Bird b : birds) {
            printBird(b);
        }
    }
    
    public void printOne(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                printBird(b);
                return;
            }
        }
    }
    
    public void printBird(Bird b) {
        System.out.print(b.getName() + " (" + b.getLatinName() + "): ");
        System.out.println(b.getObservations() + " observations");
    }
}
