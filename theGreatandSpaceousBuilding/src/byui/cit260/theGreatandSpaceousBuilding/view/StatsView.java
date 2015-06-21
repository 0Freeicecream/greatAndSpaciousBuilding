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
/**
 *
 * @author Néna
 */
public class StatsView {
    
  public void displayStats(){
      
    Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
    int fruit = attributes.getFruit();
    int testimony = attributes.getTestimony();
    int obedience = attributes.getObedience();
         
    System.out.println("\n************************************************************");
    
    System.out.println("\n These are your current Attribute Stats"
    +"\n Fruit = " + fruit
    +"\n Testimony = " + testimony 
    +"\n Obedience = " + obedience);
    
    System.out.println("\n************************************************************");
  }
  
}
