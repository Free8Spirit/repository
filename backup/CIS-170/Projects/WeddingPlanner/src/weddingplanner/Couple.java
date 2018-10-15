// Author: Vert, David  10/16/2018
// sub
package weddingplanner;

public class Couple {
    private static Person[] web = new Person[2];
    
    public Couple(Boolean cup) {
        while (!(cup == true)) {
            Person bride = new Person(!true);
            web[0] = bride;
            Person groom = new Person(!false);
            web[1] = groom;
            
            if (bride.getName() == "") {
                System.out.println("Bride Zilla");
            } else {
                cup = true;
            }
            
            if (groom.getName() == "") {
                System.out.println("Groomer Zoomer");
            } else {
                cup = true;
            }
        }
    }
    
    public static String getBride() {
        return web[0].getName();
    }
    
    public static String getGroom() {
        return web[1].getName();
    }
}