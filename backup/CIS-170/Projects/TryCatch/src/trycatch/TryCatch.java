// Author: Vert, David  9/27/2018
package trycatch;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        
        try {
            program();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    private static void program() {
        
        Scanner sc = new Scanner(System.in);
        boolean play = true;
        boolean flag = true;
        int arr[] = new int[100];
        
        while (play) {
            flag = true;
            
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)Math.round(Math.random() * 9999);
            }
            
            while (flag) {
                int x;
                System.out.println("Please Enter an index number between 1 and 100");
                
                if (!sc.hasNextInt()) {
                    System.out.println("Close but no cigar! Please try again, but with a number in the range previded");
                    sc.nextLine();
                } else if (sc.hasNextInt()) {
                    
                    x = sc.nextInt();
                    sc.nextLine();
                    
                    if (x > 100 || x < 1) {
                        System.out.println(x + " is outside of the range, please try again");
                    } else if (x > 0 && x < 101) {
                        System.out.println("The value in the array at index " + x + " is " + arr[x - 1]);
                        flag = !flag;
                    } else {
                        System.out.println("Quackers! You have found the hidden duck!");
                    }
                }
            }
            System.out.println("Would you like to try again? yes or no? Thank you!");
            
            if (sc.hasNext()) {
                String fun = sc.next();
                char test = fun.charAt(0);
                sc.nextLine();
                
                switch (test) {
                    case 'Y':
                    case 'y':
                        play = true;
                        break;
                    case 'N':
                    case 'n':
                        play = false;
                        System.out.println("See you next time!");
                        break;
                    default:
                        System.out.println("The number you tried to call is unavailable at this time, please try again after: ");
                        break;
                }
                
            } else if (!sc.hasNext()) {
                sc.nextLine();
                System.out.println("You can't find meh!");
            } 
        }
    }
    
}