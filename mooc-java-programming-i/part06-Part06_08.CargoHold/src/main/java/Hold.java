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

public class Hold {
    private ArrayList<Suitcase> luggage;
    private int maxWeigth;
    
    public Hold(int max) {
        luggage = new ArrayList<>();
        this.maxWeigth = max;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeigth) {
            luggage.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int total = 0;
        
        total = luggage.stream().map((s) -> s.totalWeight()).reduce(total, Integer::sum);
        
        return total;
    }
    
    public void printItems() {
        luggage.forEach((s) -> {
            s.printItems();
        });
    }
    
    @Override
    public String toString() {
        return luggage.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
