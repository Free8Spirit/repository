// Author: Vert, David  9/25/2018
// sub
package testapp;

public class Account {
    private int id;
    private double balance;
    String fName, lName;
    static int idCount = 1;
    boolean set = false;
    
    private int setID() {
        id = idCount++;
        set = true;
        return id;
    }
    
    private int getID() {
        return id;
    }
    
    public double setBalance(double x, boolean set) {
        if (set == false) {
            balance = x;
            setID();
        } else if (set == true) {
            System.out.println("Account already exists, your ID is " + getID()); // error measage
        }
        return balance;
    }
    
    public double getBalance(double in, double out) {
        deposit(in);
        withdraw(out);
        return balance;
    }
    
    private double withdraw(double x) {
        if (balance - x > 0) {
            balance -= x;
        } else if (balance - x <= 0) {
            System.out.printf("Insufficient funds for transaction,\nyou do not have $%2.2f in your account to withdraw.\nThank you!\n", x); // error measage
        }
        return balance;
    }
    
    private double deposit(double x) {
        balance += x;
        return balance;
    }
    
    public void printAccount() {
        System.out.printf("%d %s, %s: \nCurrent balance: $%2.2f \n", id, lName, fName, balance);
    }
}