/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.ProgramControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import java.util.Scanner;
import byui.cit260.theGreatandSpaceousBuilding.exceptions.ProgramControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;

/**
 *
 * @author Ted and Néna
 */
public class StartProgramView extends View{

    public StartProgramView(String promptMessage) {
        super(promptMessage);
    }
    
    public void startProgram() throws ProgramControlException{
            
     
        // DISPLAY the banner screen
        this.displayBanner();
        
        // Get the players name
        String playersName = this.getPlayerName();
        
        SaveGameView saveGameView = new SaveGameView("Please select a save slot (1-3):");
        saveGameView.display();
        
        // Create a new player and throwing an exception
        Player player = ProgramControl.createPlayer(playersName);
       
        
        // DISPLAY a customized welcome message
        this.displayWelcomeMessage(player);
              
        // DISPLAY the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
}
    
    public boolean doAction(Object o) {
    return true;
    }
    
    private void displayBanner() {
        System.out.println("\n\n************************************************************");
                
        System.out.println(" Welcome to The Great and Spacious Building Game!"
            + "\n  In this game, we will make our way to the tree of life"
            + "\n  while answering spritual questions and facing challenges"
            + "\n  of faith.");
        System.out.println("************************************************************");
    }

    String getPlayerName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
         // Use keyboard input
        try {
            
            while(!valid) { //while a valid name is not retrived

                // prompt for player's name
                System.out.println("Enter the player's name below:");

                // Demands data from keyboard and trims off the blanks
                playersName = this.keyboard.readLine();
                playersName = playersName.trim();

                //If name is invalid (less than two character in length)
            try {
                    ProgramControl.createPlayer(playersName);
                }
                catch (ProgramControlException me) {
                }
                break; // out of the exit repitition
            }
        }
        catch (Exception e) {
        System.out.println("Error reading input:" + e.getMessage());
        } 
        return playersName; //Yell players name into code
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\nHey " + player.getName());
        System.out.println("\nWelcome to the Great and Spaceous Building");
        System.out.println("Enjoy your trip to the Tree of Life (if you make it\n)");
    }
}


    

