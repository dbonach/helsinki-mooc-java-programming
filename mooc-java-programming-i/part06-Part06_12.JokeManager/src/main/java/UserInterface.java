/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbonach
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager j;
    private Scanner s;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.j = manager;
        this.s = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = s.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = s.nextLine();
                j.addJoke(joke);
                continue;
            }
            
            if (command.equals("2")) {
                System.out.println(j.drawJoke());
                continue;
            }
            
            if (command.equals("3")) {
                j.printJokes();
            }
        }
    }
}
