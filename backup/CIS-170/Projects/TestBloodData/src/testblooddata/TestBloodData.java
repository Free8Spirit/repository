// Author: Vert, David  10/04/2018
package testblooddata;

public class TestBloodData {

    public static void main(String[] args) {
        BloodData tbd = new BloodData();
        System.out.println("Show the default has been initialized:");
        System.out.println("Default Blood Type: " + tbd.getBloodType());
        System.out.println("Default RH Type: " + tbd.getRhFactor());
        System.out.println("*********************");
        System.out.println("Second Test: change the fields"); 
        tbd.setBloodType("B");
        tbd.setRhFactor("-");
        System.out.println("New Blood Type: " + tbd.getBloodType());
        System.out.println("New RH Type: " + tbd.getRhFactor());
        System.out.println("*********************");
        System.out.println("Third Test: Use overloaded constructor");
        BloodData tbd2 = new BloodData("AB", "+");
        System.out.printf("Blood type: %s\nRH Factor: %s\n", tbd2.getBloodType(),tbd2.getRhFactor());
        System.out.println("*********************");
        
        // Start of Patient tests
        
        Patient patent = new Patient();
        System.out.println("Shows that the default works: ");
        System.out.println("Default ID: " + patent.ID);
        System.out.println("Default age: " + patent.age);
        System.out.println("Default Blood Data: " + patent.BloodData);
        System.out.println("*********************");
        System.out.println("Testing set commands: ");
        patent.setID(1);
        patent.setAge(24);
        patent.setBloodData("B", "-");
        System.out.println("New ID: " + patent.ID);
        System.out.println("New age: " + patent.age);
        System.out.println("New Blood Data: " + patent.BloodData);
        System.out.println("*********************");
        System.out.println("Testing overload with parameter list: ");
        Patient strong = new Patient(2, 42, "A", "+");
        System.out.println("New ID: " + strong.ID);
        System.out.println("New age: " + strong.age);
        System.out.println("New Blood Data: " + strong.BloodData);
    }
    
}
