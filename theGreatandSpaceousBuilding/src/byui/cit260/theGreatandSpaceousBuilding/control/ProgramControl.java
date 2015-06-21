/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import java.util.HashSet;
import java.util.Set;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;


/**
 *
 * @author Ted
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        theGreatandSpaceousBuilding.setPlayer(player); //Save the player
    
    Attributes attributes = new Attributes();
    
    theGreatandSpaceousBuilding.setAttributes(attributes); //save the attributes
        return player;
    
    }
    
}
