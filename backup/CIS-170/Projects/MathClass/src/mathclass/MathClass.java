//Author: Vert, David   9/13/2018

package mathclass;
import java.lang.Math;
import java.text.NumberFormat;

public class MathClass {

    public static void main(String[] args) {
        // READ MEH: https://www.cs.kent.ac.uk/people/staff/djb/rcx/doc/java/lang/Math.html
        
        // Math class is static
        // Fields:
        // static double E
        // static double NaN
        // static double PI
        
        System.out.println(Math.E);
        System.out.println(Math.PI);
        
        // Methods:
        // the: round method; pow method; sqrt method; max and min method; random method;
        
        double x = 53.525540;
        x = (double)Math.round(x * 100 / 100);
        System.out.println(x);
        x = (double)Math.round(x * 100) / 100;
        System.out.println(x);
        
        int a = 86;
        int b = 68;
        
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("Min: " + min + "; Max: " + max);
        
        // READ MEH: https://docs.oracle.com/javase/7/docs/api/java/text/NumberFormat.html
        
        String myString = "Testing";
        int myNumber = 72;
        System.out.println("Is string: " + myString);
        myString = NumberFormat.getInstance().format(myNumber);
        System.out.println("Was string: " + myString);
        
        double myMoney = 123.456789;
        System.out.println("What will be Cash: " + myMoney);
        myString = NumberFormat.getCurrencyInstance().format(myMoney);
        System.out.println("And now: " + myString);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
    }
    
}
