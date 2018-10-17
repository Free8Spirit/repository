// Author: Vert, David  10/08/2018
// sub
package testbread;

public class Bread {
    private String breadType;
    private int calories;
    public final static String MOTTO = "The staff of life"; // "The bread that's sweet, and a tasty treat";
    
    public Bread(String breadType, int calories) {
        this.breadType = breadType;
        this.calories = calories;
    }
    
    public String getBreadType() {
        return breadType;
    }
    
    public int getCalories() {
        return calories;
    }
    
    public void printBread() {
        System.out.println(getBreadType() + ": " + getCalories() + " calories");
    }
}