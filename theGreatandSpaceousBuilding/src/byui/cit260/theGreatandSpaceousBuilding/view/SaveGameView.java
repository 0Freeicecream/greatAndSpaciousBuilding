/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.SaveGameControl;
import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import byui.cit260.theGreatandSpaceousBuilding.view.ErrorView;

/**
 *
 * @author Néna
 */
public class SaveGameView extends View{

    public SaveGameView(String promptMessage) {
        super(promptMessage);
    }
    
    public boolean doAction(Object saveSlot){
        int slotNum;
        try {
            slotNum = Integer.parseInt((String)saveSlot);
        } 
        catch (NumberFormatException e) {
            ErrorView.display(this.getClass().getName(),
                    "You must enter a number");
            return false;
        }
        if (slotNum < 1 || slotNum > 3) {
            ErrorView.display(this.getClass().getName(),
                    "Slot number must be between 1 and 3");
            return false;
        }
        
        // Set the slot number
        
        return true;
    }
}
