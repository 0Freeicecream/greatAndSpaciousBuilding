/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import byui.cit260.theGreatandSpaceousBuilding.model.Game;
import byui.cit260.theGreatandSpaceousBuilding.model.Map;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Scene;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;


/**
 *
 * @author Néna
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        // Create new game and save it in theGreatandSpaceousBuilding
        Game game = new Game();
        theGreatandSpaceousBuilding.setCurrentGame(game);
        
        //Save player in THE GAME
        game.setPlayer(player);
        
        //Create, initialize and save the Map
        Map map = MapControl.createMap();
        game.setMap(map);
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("Your assignScenesToLocations is working perfectly");
    }
    
}
