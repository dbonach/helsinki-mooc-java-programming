
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account deivitAccount = new Account("Deivit's account", 100.00);
        
        deivitAccount.deposit(20.0);
        
        System.out.println(deivitAccount.toString());
        
    }
}
