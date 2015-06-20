/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.util.Scanner;
import byui.cit260.theGreatandSpaceousBuilding.control.MapControl;
import byui.cit260.theGreatandSpaceousBuilding.view.QuizView;
/**
 *
 * @author NÃ©na
 */
public class MapView {
  
    public String movePrompt = "Please enter a direction (N, S, E, or W)";
    char dir = 'X';    
           
    void displayPrompts() {
        char selection;
        do {
            System.out.println("you are at: " + MapControl.getLocation() );
            System.out.println(movePrompt); // displays the location of the user
            
            String input = this.getInput(); //Gets user input
            input = input.toUpperCase();
            selection = input.charAt(0); //Get first character of string
            
            this.pickDirection(selection); //do action based on selection
            if (dir != 'X' && MapControl.movePlayer(dir)) {
                break;
            }
            else {
                System.out.println("You can not travel that direction");
            }
            
        } while (true); // selection is not correct
        
                
        
        AttributeMenuView attributemenu = new AttributeMenuView();
        attributemenu.display();   //hand off to AttributeMenuView
    }

    String getInput() {
        boolean valid = false; // indicates if the selection has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); // Use keyboard input
        
        while(!valid) { //while a valid selection is not retrived
            
            // Demands data from keyboard and trims off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            //If selection is invalid ( not N, S, E or W
            if (selection.length() < 1) {
                System.out.println("Invalid command, must contain at least one character");
                continue; // repeats
            }
            break; // out of the exit repitition
        }
        
        return selection; //Yell players selection into code
    }
    
    public void pickDirection(char direction) {
        switch (direction) {
            case 'N': // Choose North
            case 'S': // Choose South
            case 'E': // Choose East
            case 'W': // Choose West
                dir = direction;
                break;
            default: // displays in any other instance
                dir = 'X';
                System.out.println("!!--Not a valid direction--!!");
                break;
        }
    }
    }