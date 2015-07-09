/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.util.Scanner;
import byui.cit260.theGreatandSpaceousBuilding.control.MapControl;
import byui.cit260.theGreatandSpaceousBuilding.exceptions.MapControlException;
import byui.cit260.theGreatandSpaceousBuilding.view.QuizView;
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
    }
    
    public boolean doAction(Object o) {
        return true;
    }
    void displayPrompts() {
        char selection;
        do {
            System.out.println("you are at: " + MapControl.getLocation() );
            System.out.println(movePrompt); // displays the location of the user
            
            String input = this.getInput(); //Gets user input
            input = input.toUpperCase();
            selection = input.charAt(0); //Get first character of string
            
            this.pickDirection(selection); //do action based on selection
            try {
                MapControl.movePlayer(dir);
                break;
            }
            catch (MapControlException e) {
                System.out.println("You can not travel that direction");
            }

            
        } while (true); // selection is not correct
        
                
        
        AttributeMenuView attributemenu = new AttributeMenuView();
        attributemenu.display();   //hand off to AttributeMenuView
    }

public String getInput() {
    boolean valid = false; // indicates if the selection has been retrieved
    String selection = null;
     // Use keyboard input
    try {
        
        while(!valid) { //while a valid selection is not retrived
            
            // Demands data from keyboard and trims off the blanks
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            //If selection is invalid ( not N, S, E or W
            if (selection.length() < 1) {
                System.out.println("Invalid command, must contain at least one character");
                continue; // repeats
            }
            break; // out of the exit repitition
        }
    }
    catch (Exception e) {
        System.out.println("Error reading input:" + e.getMessage());
        } 
        return selection; //Yell players selection into code
    }
    
    public int getIntNumber() {
        int number = -1;
                
        while (number == -1) {
            String value = this.getInput();
            value = value.trim().toUpperCase();
            
            if (value.equals("Q"))
                break;
            
            try{
            //parse and convert number from text to a double
            number = Integer.parseInt(value);
            } catch (NumberFormatException nf) {
                System.out.println("HUMAN: YOU HAVE MADE A MISTAKE!"
                        + "\nINPUT APPROPRIATE NUMBER OR USE Q TO QUIT!"
                        + "\n-SINCERELY"
                        + "\n YOUR COMPUTER");
            }
        }
        
        return number;
    }
    
    public void pickDirection(char direction) {
        boolean isValid = false;
        switch (direction) {
            case 'N': // Choose North
            case 'S': // Choose South
            case 'E': // Choose East
            case 'W': // Choose West
                dir = direction;
                isValid = true;
                break;
            case '6':
                StatsView statsview = new StatsView();
                statsview.displayStats();
                break;
            
            case '7':
                FullMapView fullMapView = new FullMapView();
                fullMapView.displayFullMap();
                break;
                
            default: // displays in any other instance
                dir = 'X';
                System.out.println("!!--Not a valid direction--!!");
                break;
        }
    }
    }