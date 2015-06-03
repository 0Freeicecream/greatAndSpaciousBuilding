/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Randy
 */
public class MainMenuView {
    
    private final String MENU =
              "\n-----------Main Menu-----------"
            + "\nN - New Game"
            + "\nS - Save Game"
            + "\nL - Load Saved Game"
            + "\nH - Help Documents"
            + "\nT - Top Scores"
            + "\nQ - Quit Game"
            + "\n-------------------------------";
            

    void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENU); // displays the main menu
            
            String input = this.getInput(); //Gets user input
            selection = input.charAt(0); //Get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection != 'E'); // selection is not exit
        
    }

    String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); // Use keyboard input
        
        while(!valid) { //while a valid name is not retrived
            
            // Demands data from keyboard and trims off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            //If name is invalid (less than two character in length)
            if (selection.length() < 1) {
                System.out.println("Invalid command, must contain at least one character");
                continue; // repeats
            }
            break; // out of the exit repitition
        }
        
        return selection; //Yell players selection into code
    }
    
    public void doAction(char choice) {
        switch (choice) {
            case 'N': // Create and start new.game
                this.startNewGame();
                break;
            case 'S': // Saves current game
                this.saveGame();
                break;
            case 'L': // restores and runs existing game
                this.startExistingGame();
                break;
            case 'H': // Loads the help menu
                this.displayHelpMenu();
                break;
            case 'T': // Show off other people's best runs and fill the player with shame/glory
                this.displayBestScores();
                break;
            case 'Q': // Closes program so players can get to more important things
                return;
            default: // displays in any other instance
                System.out.println("!!--This is not a valid option, use the menu for a correct option--!!");
                break;
            
        }
    }    
        private void startNewGame() {
            GameControl.createNewGame(theGreatandSpaciousBuilding.getPlayer());
            
            //display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
        }
        
        private void saveGame() {
            System.out.println("--Your saveGame function is working perfectly--");
        }
        
        private void startExistingGame() {
            System.out.println("--Your startExistingGame function is working perfectly--");
        }
        
        private void displayHelpMenu() {
            System.out.println("--Your displayHelpMenu function is working perfectly--");
        }
        
        private void displayBestScores() {
            System.out.println("--Your displayBestScores function is working perfectly--");
        }
        
}
