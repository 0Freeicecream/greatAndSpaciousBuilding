/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGreatandSpaceousBuilding;

import byui.cit260.theGreatandSpaceousBuilding.model.Challenge;
import byui.cit260.theGreatandSpaceousBuilding.model.Game;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Location;
import byui.cit260.theGreatandSpaceousBuilding.model.Map;
import byui.cit260.theGreatandSpaceousBuilding.model.Scenario;
import byui.cit260.theGreatandSpaceousBuilding.view.StartProgramView;

/**
 *
 * @author Ted 
*/
public class theGreatandSpaceousBuilding {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static getCurrentGame() {
        return currentGame;
    }
    
    private static void setCurrentGame(Game currentGame) {
        theGreatandSpaceousBuilding.currentGame = currentGame;
    }
    
    private static getPlayer() {
        return player;
    }
    
    private static void setPlayer (Player player) {
        theGreatandSpaceousBuilding.player = player;
    }
        
    public static void main(String[] args) {
        
        //BruceBanner Test
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
    }
}
