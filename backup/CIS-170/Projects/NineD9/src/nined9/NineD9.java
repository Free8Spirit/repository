
/**package NineD9;
*/
/**
 * @author: Vert, David
 * 8/24/2018
 */
 
public class NineD9 {

    public static void main(String[] args) {
        int x = 100;
        while (x > 0){
            x = x - 1;
            if (x < 1) {
                System.out.println("There is no more bottles of Cyanide left on the wall! You take nothing down and pass out! Ain't no more bottles of Cyanide left on the wall!");
                
				/** Infinity Loop
                *while (x <= 99) {
                *    if (x < 1) {
                *        System.out.println("There is no more bottles of Cyanide left on the wall! You take nothing down and pass out! Ain't no more bottles of Cyanide left on the wall!");
                *    } else if (x < 2) {
                *        System.out.println("There is " + x + " bottle of Cyanide on the wall! You take the last " + x + " down and pass it around! " + "No more bottles of Cyanide left on the wall!");
                *    } else {
                *        System.out.println("There are " + x + " bottles of Cyanide on the wall! Take one down and pass it around! " + (x - 1) + " bottles of Cyanide on the wall!");
                *    }
                *   
                *   x = x + 1;
                *}
                */
				
            } else if (x < 2) {
                System.out.println("There is " + x + " bottle of Cyanide on the wall! You take the last " + x + " down and pass it around! " + "No more bottles of Cyanide left on the wall!");
            } else {
                System.out.println("There are " + x + " bottles of Cyanide on the wall! Take one down and pass it around! " + (x - 1) + " bottles of Cyanide on the wall!");
            }
        }
    }
}