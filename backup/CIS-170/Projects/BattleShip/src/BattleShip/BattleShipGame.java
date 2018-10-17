// sub
package BattleShip;

public class BattleShipGame {
    public static void main(String[] args) {
        int numGuess = 0;
        GameHelper helper = new GameHelper();
        Ship battleShip = new Ship();
        int randomNum = (int) (Math.random() * 5);
        System.out.println(randomNum); //print for debugging purposes
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        battleShip.setLocationCells(locations);
        
        boolean isAlive = true;
        
        while (isAlive){
            String guess = helper.getUserInput("Enter a number");
            String result = battleShip.checkYourself(guess);
            numGuess++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numGuess + " guesses");
            } 
        }
    }
}
