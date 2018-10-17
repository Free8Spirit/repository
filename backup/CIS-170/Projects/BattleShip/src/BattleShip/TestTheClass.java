// Author: Vert, David  10/02/2018 -
package BattleShip;

public class TestTheClass {

    public static void main(String[] args) {
        Ship battleShip = new Ship();
        int[] locations = {2,3,4};
        
        battleShip.setLocationCells(locations);
        String userGuess = "3";
        String result = battleShip.checkYourself(userGuess);
        
    }
    
}
