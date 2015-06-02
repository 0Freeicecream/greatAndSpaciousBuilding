/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.ProgramControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import java.util.Scanner;

/**
 *
 * @author Néna
 */
public class StartProgramView {
    
    public void startProgram(){
            
     
        // DISPLAY the banner screen
        this.displayBanner();
        
        // Get the players name
        String playersName = this.getPlayerName();
        
        // Create a new player
        Player player = ProgramControl.createPlayer(playersName);
        
        // DISPLAY a customized welcome message
        this.displayWelcomeMessage(player);
        
        // DISPLAY the main menu
      
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
        Scanner keyboard = new Scanner(System.in); // Use keyboard input
        
        while(!valid) { //while a valid name is not retrived
            
            // prompt for player's name
            System.out.println("Enter the player's name below:");
            
            // Demands data from keyboard and trims off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //If name is invalid (less than two character in length)
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; // repeats
            }
            break; // out of the exit repitition
        }
        
        return playersName; //Yell players name into code
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\nHey " + player.getName());
        System.out.println("\nWelcome to the Great and Spaceous Building");
        System.out.println("\nEnjoy your trip to the Tree of Life (hopefully)");
    }
}


    

