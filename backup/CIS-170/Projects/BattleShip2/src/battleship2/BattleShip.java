package battleship2;


import java.util.*;

public class BattleShip {
    private GameHelper helper = new GameHelper();
    private ArrayList<Ship> shipsList = new ArrayList<Ship>();
    private int numOfGuesses = 0;
    
    private void setUpGame() {
        Ship one = new Ship();
        one.setName("S.S. Minnow");
        Ship two = new Ship();
        two.setName("Orca");
        Ship three = new Ship();
        three.setName("The Black Pearl");
        shipsList.add(one);
        shipsList.add(two);
        shipsList.add(three);
        
        System.out.println("Your goal is to sink three Ships.");
        System.out.println("S.S. Minnow, Orca, The Black Pearl");
        System.out.println("Try to sink them all in the fewest number of guesses");
        
        for (Ship shipSet : shipsList) {
            ArrayList<String> newLocation = helper.placeShip(3);
            shipSet.setLocationCells(newLocation);
        }
    }
    
    private void startPlaying() {
        while (!shipsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    
    private void checkUserGuess(String userGuess)
    {
        numOfGuesses++;
        String result = "miss";
        
        for (Ship shipsToTest : shipsList) //(int i = 0; i < shipsList.size(); i++);
        {
            result = shipsToTest.checkYourself(userGuess);
            if (result.equals("hit"))
            {
                break;
            }
            if (result.equals("kill"))
            {
                System.out.println(shipsToTest.name);
                shipsList.remove(shipsToTest);
                break;
            }
        }
        System.out.println(result);
    }
    
    private void finishGame() {
        System.out.println("All ships are sunk!  You have won the game!");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses");
            System.out.println("You sank them all Shiply and won the Battle.");
        }
        else
        {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
    
    public static void main(String[] args) {
        BattleShip game = new BattleShip();
        game.setUpGame();
        game.startPlaying();
    }
}
