/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbonach
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double money) {
        this.balance = money;
    }
    
    public void eatAffordably() {
        if (balance >= 2.6) {
            this.balance -= 2.6;
        }
    }
    
    public void eatHeartily() {
        if (balance >= 4.6) {
            this.balance -= 4.6;
        }
        
    }
    
    public void addMoney(double money) {
        if (money > 0) {
            if (money + this.balance > 150) {
                this.balance = 150;
            } else {
                this.balance += money;
            }
            
        }
        
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
