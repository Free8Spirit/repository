// Author: Vert, David  10/11/2018
package testbread;

public class TestBread {

    public static void main(String[] args) {
        System.out.println(Bread.MOTTO);
        Bread leaf = new Bread("Leaf Bread", 0);
        leaf.printBread();
        
        // Should fall flat and not pass bread inspection do to passcode: (invalid); No bun intended ^-^
        //Bread flat = new Bread();
        
        Bread banana = new Bread("Banana Bread", 5);
        banana.printBread();
        
        Bread mankay = new Bread("Monkey Bread", 22);
        mankay.printBread();
        
        // Begin TestSandwichFilling
        System.out.println("******************");
        
        SandwichFilling meaty = new SandwichFilling("Three Meat", 8);
        meaty.showFiller();
        
        SandwichFilling sponge = new SandwichFilling("Egg Salad", 15);
        sponge.showFiller();
        
        SandwichFilling vegan = new SandwichFilling("Cat/Dog Meat", 2);
        vegan.showFiller();
        
        // Begin TestSandwich
        System.out.println("******************");
        
        Sandwich[] Grr = new Sandwich[3];
        
        Sandwich curious = new Sandwich("Monkey Bread", 22, "Cat/Dog Meat", 2);
        Grr[0] = curious;
        //Grr[0].makeSandwich();
        
        Sandwich sadwhitch = new Sandwich("Banana Bread", 5, "Egg Salad", 15);
        Grr[1] = sadwhitch;
        
        Sandwich flave = new Sandwich("Leaf Bread", 0, "Three Meat", 8);
        Grr[2] = flave;
        
        for (int i = 0; i < Grr.length; i++) {
            Grr[i].makeSandwich();
            System.out.println("******************");
        }
    }
    
}