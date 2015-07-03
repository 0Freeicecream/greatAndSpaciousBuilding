/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.SaveGameControl;

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
            System.out.println("You must enter a number");
            return false;
        }
        if (slotNum < 1 || slotNum > 3) {
            System.out.println("Slot number must be between 1 and 3");
            return false;
        }
        
        // Set the slot number
        
        return true;
    }
}
