/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;
import byui.cit260.theGreatandSpaceousBuilding.control.TopScoreControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;

/**
 *
 * @author Néna
 */
public class TopScoreView {
 
    public void displayTopScore(){
            Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
        
        int fruit = attributes.getFruit();
        int testimony = attributes.getTestimony();
        int obedience = attributes.getObedience();
        
        TopScoreControl topscore = new TopScoreControl();
        System.out.println("\n*****TOP SCORE******");
        System.out.println("\n Your Score is:" + topscore.getScore(fruit, testimony, obedience));
 
    }
}
