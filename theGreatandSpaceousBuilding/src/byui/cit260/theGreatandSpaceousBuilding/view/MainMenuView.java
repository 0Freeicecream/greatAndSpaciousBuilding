/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.GameControl;
import java.util.Scanner;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;

/**
 *
 * @author Ted and Nena
 */

public class MainMenuView extends View {
    
        public MainMenuView(){
            super("\n-----------Main Menu-----------"
                + "\nN - New Game"
                + "\nS - Save Game"
                + "\nL - Load Saved Game"
                + "\nH - Help Documents"
                + "\nT - Top Scores"
                + "\nQ - Quit Game"
                + "\n-------------------------------");
        }
    
    @Override
    public boolean doAction(Object obj) {
        //Defines obj String for Superclass
        String value = (String) obj;
        // convert to Uppercase
        value = value.toUpperCase();
        //get first character entered
        char choice = value.charAt(0);
        
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
                return true;
            default: // displays in any other instance
                System.out.println("!!--This is not a valid option, use the menu for a correct option--!!");
                break;
            
        }
            return false;
    }
    
    private void startNewGame() {
            GameControl.createNewGame(theGreatandSpaceousBuilding.getPlayer());
            
            //display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        }
        
        private void saveGame() {
            System.out.println("--Your saveGame function is working perfectly--");
        }
        
        private void startExistingGame() {
            System.out.println("--Your startExistingGame function is working perfectly--");
        }
        
        private void displayHelpMenu() {            
            //display the help menu
            HelpMenuView helpMenu = new HelpMenuView();
            helpMenu.display();
        }
        
        private void displayBestScores() {
            System.out.println("--Your displayBestScores function is working perfectly--");
        }
        
}
