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

public class Stack {
    ArrayList<String> items;
    
    public Stack() {
        this.items = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public void add(String value) {
        this.items.add(value);
    }
    
    public ArrayList<String> values() {
        ArrayList<String> copy = new ArrayList<>(items);
        return copy;
    }
    
    public String take() {
        String lastItem = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return lastItem;
    }
}
