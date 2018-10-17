// Author: Vert, David  10/11/2018
// sub
package testbread;

public class Sandwich {
    String bread, filling;
    int totCal = 0;
    
    public Sandwich(String bread, int cal2, String filling, int cal1) {
        Bread sandB = new Bread(bread, cal2);
        this.bread = sandB.getBreadType();
        this.totCal += 2 * sandB.getCalories();
        SandwichFilling sandF = new SandwichFilling(filling, cal1);
        this.filling = sandF.getFilling();
        this.totCal += sandF.getCalories();
    }
    
    public void makeSandwich() {
        System.out.println("Bread: " + this.bread + ";");
        System.out.println("Filling: " + this.filling + ";");
        System.out.println("Total Calories: " + this.totCal + ".");
    }
}
