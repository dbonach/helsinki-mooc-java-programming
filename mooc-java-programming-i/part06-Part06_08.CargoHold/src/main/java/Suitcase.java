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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    public void printItems() {
        items.forEach((i) -> {
            System.out.println(i);
        });
    }
    
    public int totalWeight() {
        int total = 0;
        
        total = items.stream().map((i) -> i.getWeight()).reduce(total, Integer::sum);
        
        return total;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for (Item i: items) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        
        return heaviest;
    }
    
    @Override
    public String toString() { 
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (items.size() == 1) {
           return "1 item (" + totalWeight() + " kg)"; 
        } 
        
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}
