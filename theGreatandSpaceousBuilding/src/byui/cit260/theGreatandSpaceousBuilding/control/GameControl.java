/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import byui.cit260.theGreatandSpaceousBuilding.exceptions.GameControlException;
import byui.cit260.theGreatandSpaceousBuilding.model.Game;
import byui.cit260.theGreatandSpaceousBuilding.model.Map;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Scene;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import byui.cit260.theGreatandSpaceousBuilding.view.View;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 *
 * @author Néna
 */
public class GameControl extends View {
    
    public static void createNewGame(Player player) {
        // Create new game and save it in theGreatandSpaceousBuilding
        Game game = new Game("");
        theGreatandSpaceousBuilding.setCurrentGame(game);
        
        //Save player in THE GAME
        game.setPlayer(player);
        
        //Create, initialize and save the Map
        Map map = MapControl.createMap();
        game.setMap(map);
    }

    public GameControl(String promptMessage) {
        super(promptMessage);
    }

    public void assignScenesToLocations(Map map, Scene[] scenes) {
        this.console.println("Your assignScenesToLocations is working perfectly");
    }
    
    @Override    
    public boolean doAction(Object o) {
    return true;
    }
    
    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);  //Write the game object out to the file
        }
        catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void startExistingGame(String filepath)
            throws GameControlException {
         Game game = null;
        try( FileInputStream fops = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fops);
            
            game = (Game) output.readObject();  //read the game object out to the file
        }
        catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        //close the output file
        theGreatandSpaceousBuilding.setCurrentGame(game);
    }
}

