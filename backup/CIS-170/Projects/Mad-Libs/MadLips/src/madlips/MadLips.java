// Author: Vert, David
package madlips;
import java.util.Scanner;


public class MadLips {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num;
        String word1;
        String word2;
        String word3;
        String phrase;

        System.out.println("Enter your favorite number followed by a name: Then hit enter");
        num = sc.nextDouble();
        word3 = sc.nextLine();
        System.out.println("What is one of your favorite quotes? ");
        phrase = sc.nextLine();
        System.out.println("What is your favorite animal? ");
        word1 = sc.nextLine();
        System.out.println("Make a wish: ");
        word2 = sc.nextLine();
        
        
        System.out.println("There was once an unfortunate person named " + word3 + " who died " + num + " times to live once more. And it all started because " + word3 + " tried to cook a " + word1 + ". But instead, " + word3 + " became the meal for the " + word1 + ". So on a starry night " + word3 + " made a wish, a most valiant wish indead, upon what seemed to be a falling star. '" + word2 + ".' But it didn't come true, so once again the same wish was made, but on what seemed to be a magical genie lamp. The next day when " + word3 + " woke up and looked into the mirror, a " + word1 + " was staring back. Need less to say, '" + word2 + ",' did not come true. Yet once more the wish was made, and after the third wish " + word3 + " had offered a wise quote that was once forgotten, '" + phrase + ".' But alas, " + word3 + "'s wish still had failed to come true, even till this day.");
    }
    
}
