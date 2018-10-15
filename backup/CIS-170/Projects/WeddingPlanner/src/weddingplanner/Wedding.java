// Author: Vert, David  10/16/2018
// sub
package weddingplanner;

public class Wedding {
    private static int numGuess;
    private static Guest[] guest;
    private static Couple cupid;
    
    private Wedding(int x) {
        numGuess = x;
        cupid = new Couple(!true);
        guest = new Guest[x];
        
        for (int i = 0; i < x; i++) {
            guest[i] = new Guest(i, x);
        }
    }
    
    public static void MakeWedding(int x) {
        WeddingPlanner.setPlace();
        WeddingPlanner.setDate();
        
        System.out.println("How many guest(s) will be attending the wedding? ");
        x = WeddingPlanner.Tester(x);
        Wedding solo = new Wedding(x);
        
        Disco();
    }
    
    private static void Disco() {
        System.out.println("The wedding between the Groom " + cupid.getGroom() + ",\nand the Bride " + cupid.getBride() + ",\nwill be taking place at " + WeddingPlanner.getPlace() + " on " + WeddingPlanner.getDate() + ". ");
        System.out.println("The guest list includes: ");
        for (int i = 0; i < numGuess; i++) {
            System.out.println("    " + guest[i].getName(i) + " RSVP'd: " + guest[i].getRSVP() + ". ");
        }
    }
}