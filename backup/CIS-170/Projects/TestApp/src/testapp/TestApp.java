// Author: Vert, David  9/25/2018
package testapp;

public class TestApp {

    public static void main(String[] args) {
        Account test = new Account();
        test.setBalance(20000, test.set);
        test.fName = "Tester";
        test.lName = "Beta";
        
        test.getBalance(3000, 2500);
        
        test.printAccount();
        
        Account Girr = new Account();
        Girr.setBalance(50, Girr.set);
        Girr.setBalance(100, Girr.set); // Can be commented out, showing that a user can't create multiple accounts unless used in an array but would need a little alteration to coding
        Girr.fName = "Girr";
        Girr.lName = "Sandwhich";
        
        Girr.getBalance(0, 25);
        Girr.getBalance(2, 50); // Can't withdraw if balance would be < "$0.00"
        
        Girr.printAccount();
    }
    
}