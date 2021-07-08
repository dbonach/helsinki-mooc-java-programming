/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbonach
 */
public class Container {
    private int amount;
    private int maxAmount;
    
    public Container() {
        this.amount = 0;
        this.maxAmount = 100;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount <= 0) {
            // Do nothing
        } else if (this.amount + amount > this.maxAmount) {
            this.amount = this.maxAmount;
        } else { 
            this.amount += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            // Do nothing
        } else if (this.amount - amount < 0) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }
    
    @Override
    public String toString() {
        return this.amount + "/100";
    }
    
}
