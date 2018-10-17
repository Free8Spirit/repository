// Author: Vert, David  10/04/2018
// sub
package testblooddata;

public class BloodData {
    String bloodT, Rh;
    
    public BloodData() {
        this.bloodT = "O";
        this.Rh = "+";
    }
    
    public String getBloodType() {
        return this.bloodT;
    }
    
    public String getRhFactor() {
        return this.Rh;
    }
    
    public String setBloodType(String bloodT) {
        if (bloodT == "O" || bloodT == "A" || bloodT == "B" || bloodT == "AB") {
            this.bloodT = bloodT;
        } else {
            System.out.println(bloodT + " is not a compatible blood type.");
            this.bloodT = "O";
        }
        return this.bloodT;
    }
    
    public String setRhFactor(String Rh) {
        if (Rh == "+" || Rh == "-") {
            this.Rh = Rh;
        } else {
            System.out.println(Rh + " is not a compatible Rh factor.");
            this.Rh = "+";
        }
        return this.Rh;
    }
    
    public BloodData(String bloodT, String Rh) {
        this.bloodT = setBloodType(bloodT);
        this.Rh = setRhFactor(Rh);
    }
}
