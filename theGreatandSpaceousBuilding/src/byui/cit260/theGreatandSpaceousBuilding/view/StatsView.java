/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.AttributeControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Néna
 */
public class StatsView extends View {


    public StatsView(String placeHolder){
        super(placeHolder);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      public boolean doAction(Object o) {
        return true;
    }
      
  public void displayStats(){
      
    Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
    int fruit = attributes.getFruit();
    int testimony = attributes.getTestimony();
    int obedience = attributes.getObedience();
         
    this.console.println("\n************************************************************");
    
    this.console.println("\n These are your current Attribute Stats"
    +"\n Fruit = " + fruit
    +"\n Testimony = " + testimony 
    +"\n Obedience = " + obedience);
    
    this.console.println("\n************************************************************");
  }
  
}
