// Author: Vert, David  9/13/2018
package voworcon;
import java.util.Arrays;
import java.util.Scanner;

public class VowOrCon {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        char test;
        String arr[];
        int[] vowel = {65, 69, 73, 79, 85};
        int[] consonate = {66, 67, 68, 70, 71, 72, 74, 75, 76, 77, 78, 80, 81, 82, 83, 84, 86, 87, 88, 89, 90};
        int[] number = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        boolean match;
        
        System.out.println("Enter a word: ");
        String var = z.nextLine();
        
        for (int i = 0; i < var.length(); i++) {
            match = false;
            test = var.charAt(i);
            
            for (int x = 0; x < vowel.length; x++) {
                int vow = vowel[x];
                
                if (test == vow) {
                    System.out.println(test + " is an uppercase vowel");
                    match = true;
                } else if (test == vow + 32) {
                    System.out.println(test + " is an lowercase vowel");
                    match = true;
                }
            }
            
            for (int x = 0; x < consonate.length; x++) {
                int con = consonate[x];
                
                if (test == con) {
                    System.out.println(test + " is an uppercase consonate");
                    match = true;
                } else if (test == con + 32) {
                    System.out.println(test +  " is an lowercase consonate");
                    match = true;
                }
            }
            
            for (int x = 0; x < number.length; x++) {
                int num = number[x];
                
                if (test == num) {
                    System.out.println(test + " is a number");
                    match = true;
                }
            }
            
            if (match == false) {
                System.out.println(test + " POTATO!!!");
            }
        }
    }
}
// MUST LOVE POTATOES ^-^