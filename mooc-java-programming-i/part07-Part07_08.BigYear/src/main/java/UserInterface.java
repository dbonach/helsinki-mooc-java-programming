/**
 *
 * @author dbonach
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner s;
    private BirdsDb db;
    
    public UserInterface(Scanner s, BirdsDb db) {
        this.s = s;
        this.db = db;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = s.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = s.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = s.nextLine();
                
                Bird b = new Bird(name, latinName);
                this.db.addBird(b);
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = s.nextLine();
                db.addObservation(name);
            }
            
            if (command.equals("All")) {
                db.printAll();
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = s.nextLine();
                db.printOne(name);
            }
        }
    }
}
