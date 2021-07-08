/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbonach
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task) {
        this.tasks.add(task);
    }
    
    public void print() {
        int i = 1;
        
        for (String t: this.tasks) {
            System.out.print(i);
            System.out.print(": ");
            System.out.println(t);
            i++;
        }
    }
    
    public void remove(int number) {
        tasks.remove(number - 1);
    }
}
