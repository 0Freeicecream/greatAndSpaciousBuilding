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
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;


/**
 *
 * @author Néna
 */
public class StatsView extends View {


    public StatsView(String placeHolder){
        super(placeHolder);
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      public boolean doAction(Object o) {
        return true;
    }
      
  public void displayStats(){
      
    Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
    int fruit = attributes.getFruit();
    int testimony = attributes.getTestimony();
    int obedience = attributes.getObedience();
    this.console.println("SAVE FILE: Please enter a file name"); 
  
    String fileName = getInput(); 
    
    String fileContents = "\n************************************************************" +
    
    "\n List of Current Attribute Stats"
    +"\n ATTRIBUTE\t\t\tSTATS"        
    +"\n Fruit\t\t\t\t" + fruit
    +"\n Testimony\t\t\t" + testimony 
    +"\n Obedience\t\t\t" + obedience
    
    + "\n************************************************************";
    this.console.println(fileContents);
    try {
       OutputStream outputStream = new FileOutputStream(fileName);
       outputStream.write(fileContents.getBytes()); 
       this.console.println("You have successfully saved your report");
       outputStream.close();
    }
    catch (Exception e)  {
        ErrorView.display(this.getClass().getName(),"Sorry, you failed to write to a file");
    }
  }
  
}
