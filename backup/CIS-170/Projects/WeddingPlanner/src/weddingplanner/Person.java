// Author: Vert, David  10/16/2018
// sub
package weddingplanner;

public class Person {
    private String fname, lname, name;
    
    public Person(Boolean meh) {
        if (!meh) {
            System.out.println("What is the Bride's name? ");
        } else if (meh) {
            System.out.println("What is the Groom's name? ");
        }
        this.setName();
    }
    
    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    
    public String getName() {
        String[] parts = this.name.split(" ");
        this.setFname(parts[0]);
        this.setLname(parts[1]);
        this.name = (getFname() + " " + getLname());
        return name;
    }
    
    public String setName() {
        this.name = WeddingPlanner.Tester(true);
        this.getName();
        return name;
    }
    
    private String setFname(String fname) {
        this.fname = fname;
        return getFname();
    }
    
    private String setLname(String lname) {
        this.lname = lname;
        return getLname();
    }
    
    private String getLname() {
        return lname;
    }
    
    private String getFname() {
        return fname;
    }
}