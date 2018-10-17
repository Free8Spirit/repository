//Author: Vert, David 9/4/2018
//package conversionapp;
import java.util.Scanner;

public class ConversionApp {
    //Scanner z = new Scanner(System.in);
    double feet;
    double meter;

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        charDis();
        path();
    }
    
    public static void path() {
        Scanner z = new Scanner(System.in);
        Boolean fun = false;
        
        while (fun == false) {
            System.out.println("Input a number, then hit enter: ");
            double num = z.nextDouble();
            z.nextLine();
            System.out.println("Input its current unit, 'feet' or 'meter', then hit enter: ");
            String str = z.next();
            
            if (str.equals("feet")) {
                System.out.println(num + " feet is equal to " + feetToMeter(num) + " meters");
            } else if (str.equals("meter")) {
                System.out.println(num + " meters is equal to " + meterToFeet(num) + " feet");
            } else {
                System.out.println("Sorry, please try again next time");
            } 
            
            System.out.println("Input 'y' if you wanna try again, or input 'n' to exit program. THANK YOU!!!");
            str = z.next();
            if (str.equals("y")) {
                fun = false;
            } else if (str.equals("n")) {
                fun = true;
            } else {
                fun = false;
                System.out.println("Sorry :p try again next time ^-^ ");
            }
        }
    }
    
    public static double feetToMeter(double feet) {
        feet = feet * 0.305;
        return feet;
    }
    
    public static double meterToFeet(double meter) {
        meter = meter * 3.279;
        return meter;
    }
    
    public static void charDis() {
        double x = 0;
        System.out.println("Feet to Meters Chart: ");
        while (x < 10) {
            x = x + 1;
            System.out.println(x + " = " + feetToMeter(x));
        }
        x = 15;
        System.out.println("Meters to Feet Chart: ");
        while (x < 65) {
            x = x + 5;
            System.out.println(x + " = " + meterToFeet(x));
        }
    }
}