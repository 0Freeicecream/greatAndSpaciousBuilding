/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;
import byui.cit260.theGreatandSpaceousBuilding.control.FinalScoreControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import java.io.BufferedReader;
import java.io.PrintWriter;


/**
 *
 * @author Néna
 */
public class FinalScoreView extends View {

    public FinalScoreView(String placeHolder) {
        super(placeHolder);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public boolean doAction(Object o) {
        return true;
    }
 
    public void displayFinalScore(){
            Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
        
        int fruit = attributes.getFruit();
        int testimony = attributes.getTestimony();
        int obedience = attributes.getObedience();
        
        FinalScoreControl finalscore = new FinalScoreControl();
        this.console.println("\n*****FINAL SCORE******");
        this.console.println("\n Your Score is:" + finalscore.getScore(fruit, testimony, obedience));
        this.console.println("SAVE SCORE: Please enter a file name (example: file.txt)"); 
        String fileName = getInput(); 
        
        
    }
}
