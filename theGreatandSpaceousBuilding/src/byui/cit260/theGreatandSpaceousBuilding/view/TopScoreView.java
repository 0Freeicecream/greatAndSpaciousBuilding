/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;
import byui.cit260.theGreatandSpaceousBuilding.control.TopScoreControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import java.io.BufferedReader;
import java.io.PrintWriter;


/**
 *
 * @author Néna
 */
public class TopScoreView extends View {

    public TopScoreView(String placeHolder) {
        super(placeHolder);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public boolean doAction(Object o) {
        return true;
    }
 
    public void displayTopScore(){
            Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
        
        int fruit = attributes.getFruit();
        int testimony = attributes.getTestimony();
        int obedience = attributes.getObedience();
        
        TopScoreControl topscore = new TopScoreControl();
        this.console.println("\n*****TOP SCORE******");
        this.console.println("\n Your Score is:" + topscore.getScore(fruit, testimony, obedience));
 
    }
}
