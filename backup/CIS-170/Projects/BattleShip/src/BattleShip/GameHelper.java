package BattleShip;
import java.util.Scanner;
import java.io.*;
public class GameHelper{
	
        
        public String getUserInput(String prompt){
            String inputLine = null;
            System.out.print(prompt + " ");
            try{
                Scanner sc = new Scanner(System.in);
                inputLine = sc.nextLine();
                if(inputLine.length() == 0) return null;
                
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
            return inputLine;
        }
}