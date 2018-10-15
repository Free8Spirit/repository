// Author: Vert, David  10/16/2018
// sub
package weddingplanner;
import java.time.*;

public class Guest {
    private LocalDate RSVP;
    private Person[] p;
    
    public Guest(int i, int x) {
        p = new Person[x];
        this.RSVP = LocalDate.now();
        this.p[i] = new Person("Anonymous", "Potato");
        System.out.println("For guest number " + (i + 1) + ", enter their First and Last name: ");
        this.p[i].setName();
    } 
    
    public String getName(int i) {
        return this.p[i].getName();
    }
    
    public LocalDate getRSVP() {
        return this.RSVP;
    }
}