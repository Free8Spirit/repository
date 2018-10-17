// Author: Vert, David  10/04/2018
// sub
package testblooddata;

public class Patient {
    int ID, age;
    String BloodData;
    
    BloodData test = new BloodData();
    
    public int getID() {
        return this.ID;
    }
    
    public int getAge() {
        return this.ID;
    }
    
    public String getBloodData() {
        return this.BloodData;
    }
    
    public int setID(int ID) {
        this.ID = ID;
        return this.ID;
    }
    
    public int setAge(int age) {
        this.age = age;
        return this.ID;
    }
    
    public String setBloodData(String BT, String Rh) {
        this.BloodData = (this.test.setBloodType(BT) + this.test.setRhFactor(Rh));
        return this.BloodData;
    }
    
    public Patient() {
        this.ID = 0;
        this.age = 0;
        this.BloodData = (this.test.getBloodType() + this.test.getRhFactor());
    }
    
    public Patient(int ID, int age, String BT, String Rh) {
        this.ID = ID;
        this.age = age;
        this.BloodData = this.setBloodData(BT, Rh);
    }
}
