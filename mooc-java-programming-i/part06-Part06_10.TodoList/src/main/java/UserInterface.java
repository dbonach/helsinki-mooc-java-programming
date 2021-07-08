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
    private TodoList l;
    private Scanner s;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.l = list;
        this.s = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = s.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("add")) {
                System.out.print("To add: ");
                String task = s.nextLine();
                l.add(task);
                continue;
            }
            
            if (input.equals("list")) {
                this.l.print();
                continue;
            }
            
            if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int i = Integer.valueOf(s.nextLine());
                l.remove(i);
                continue;
            }
            
            
        }
    }
}
