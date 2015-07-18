/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.util.Scanner;
import byui.cit260.theGreatandSpaceousBuilding.control.MapControl;
import byui.cit260.theGreatandSpaceousBuilding.exceptions.MapControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;


/**
 *
 * @author Néna
 */
public class MapView extends View {
  
    public String movePrompt = "Please enter a direction (N, S, E, or W)";
    char dir = 'X';    

    public MapView(String promptMessage) {
        super(promptMessage);
        this.setPromptMessage("you are at: " + MapControl.getLocation() + "\n" + movePrompt);
    }
    
    public boolean doAction(Object o) {
        if (super.doAction(o)) {
            return false;
        }
        String directionString = (String)o;
        char direction = directionString.charAt(0);
        
        boolean isValid = false;
        switch (direction) {
            case 'N': // Choose North
            case 'S': // Choose South
            case 'E': // Choose East
            case 'W': // Choose West
                dir = direction;
                try {
                    MapControl.movePlayer(dir);
                    AttributeMenuView attributemenu = new AttributeMenuView();
                    attributemenu.display();   //hand off to AttributeMenuView
                    isValid = true;
                }
                catch (MapControlException e) {
                    this.console.println("You can not travel that direction");
                }
                break;
            
                
            default: // displays in any other instance
                dir = 'X';
                this.console.println("!!--Not a valid direction--!!");
                break;
        }
        
        return isValid;
    }
}