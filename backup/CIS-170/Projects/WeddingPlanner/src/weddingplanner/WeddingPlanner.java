// Author: Vert, David  10/16/2018
package weddingplanner;
import java.util.regex.*;
import java.util.Scanner;

public class WeddingPlanner {

    private static Scanner run = new Scanner(System.in);
    private static String place, date;
    
    public static void main(String[] args) {
        int x = 0;
        
        Wedding.MakeWedding(x);
    }
    
    public static String setPlace() {
        System.out.println("Where will the wedding be held? ");
        place = run.nextLine();
        return place;
    }
    
    public static String getPlace() {
        return place;
    }
    
    public static String setDate() {
        System.out.println("And when will it be held? ");
        date = run.nextLine();
        return date;
    }
    
    public static String getDate() {
        return date;
    }
    
    public static String Tester(Boolean vow) {
        String name;
        int x = 0;
        Boolean bird = !true;
        
        while (!(bird == true)) {
            if (vow == true) {
                name = run.nextLine();

                //if (!(Pattern.matches("[a-zA-Z]+", name) == true)) {
                if (name.matches("[a-zA-Z]+[ ][a-zA-Z]+")) {
                    bird = !false;
                    return name;
                } else {
                    System.out.println("Please input a real/full name only");
                    if (x == 1) {
                        System.out.println("Hint " + x + ": Letters only!");
                    } else if (x == 2) {
                        System.out.println("Hint " + x + ": First and Last name please?!");
                    } else if (x == 3) {
                        System.out.println("Hint " + x + ": Are you having trouble?");
                    } else if (x == 4) {
                        System.out.println("Hint " + x + ": Would you like help?");
                    } else if (x == 5) {
                        System.out.println("Hint " + x + ": Enter 'Help Meh' to move on ^-^");
                    } else if (x == 6) {
                        System.out.println("Hint " + x + ": Are you sure you're ok?");
                    } else if (x == 7) {
                        System.out.println("Hint " + x + ": If you are playing around, I think it's working!");
                    } else if (x == 100 || x == 200 || x == 300 || x == 400 || x == 500 || x == 600 || x == 700 || x == 800 || x == 900) {
                        System.out.println("You have leveled up!");
                    } else if (x == 626) {
                        System.out.println("You have found Lilo and Stitch!");
                    } else if (x == 1000) {
                        System.out.println("New Achievement unlocked: 'No Life!'");
                    } else if (x >= 8) {
                        System.out.println("Hint " + x + ": You may be just like me, beyond help ^-^");
                    }
                    x++;
                }
            } else if (vow == false) {
                Tester(1);
            }
        }
        
        return "Anonymous Potato";
    }
    
    public static int Tester(int x) {
        Boolean fun = !true;
        
        while (!(fun == true)) {
            if (!run.hasNextInt()) {
                System.out.println("Please input a Positive Number greater than '0'. Thank you! ");
                run.nextLine();
            } else if (run.hasNextInt()) {
                x = run.nextInt();
                run.nextLine();
                
                if (x > 0) {
                    fun = !false;
                    return x;
                } else {
                    System.out.println("Please input a Positive Number greater than '0'. Thank you! ");
                }
            }
        }
        
        return x;
    }
}