/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;

/**
 *
 * @author Ted
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = theGreatandSpaceousBuilding.getInFile();
    protected final PrintWriter consol = theGreatandSpaceousBuilding.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    

    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            System.out.println(this.promptMessage); // displays the main menu
            value = this.getInput(); // get value end user demanded
            done = this.doAction(value); // Do action based on value entered
        } while (!done); // value is not exit
        
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String value = null;
        
    try {    
        while(!valid) { //while a valid name is not retrived
            
            // Demands data from keyboard and trims off the blanks
            value = keyboard.readLine();
            value = value.trim();
            
            //If name is invalid (less than two character in length)
            if (value.length() < 1) {
                System.out.println("Invalid command, must contain at least one character");
                continue; // repeats
            }
            break; // out of the exit repitition
        }
    }
    catch (Exception e) {
        System.out.println("Error reading input:" + e.getMessage());
        } 
        return value; //Yell players value into code
    }
}
