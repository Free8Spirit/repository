// Author: Vert, David  10/11/2018
// sub
package testbread;

public class SandwichFilling {
    String filler;
    int calPS;
    
    public SandwichFilling(String filler, int calPS) {
        this.filler = filler;
        this.calPS = calPS;
    }
    
    public String getFilling() {
        return this.filler;
    }
    
    public int getCalories() {
        return this.calPS;
    }
    
    public void showFiller() {
        System.out.println(getFilling() + ": " + getCalories() + " calories per serving.");
    }
}
