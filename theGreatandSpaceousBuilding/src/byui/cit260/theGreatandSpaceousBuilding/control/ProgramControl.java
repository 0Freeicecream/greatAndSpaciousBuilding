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
import byui.cit260.theGreatandSpaceousBuilding.exceptions.ProgramControlException;
import byui.cit260.theGreatandSpaceousBuilding.view.StartProgramView;


/**
 *
 * @author Ted
 */
public class ProgramControl {
    
    public static Player createPlayer(String playersName)throws ProgramControlException {
        
        if (playersName.length() < 2) {
            throw new ProgramControlException("Can not use that name"
                                              +"\nPlease try again.");
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        theGreatandSpaceousBuilding.setPlayer(player); //Save the player
    
    Attributes attributes = new Attributes();
    
    theGreatandSpaceousBuilding.setAttributes(attributes); //save the attributes
        return player;
    
    }
    
}
