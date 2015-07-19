/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.GameControl;
import java.util.Scanner;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Ted  Edited: Néna
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n-----------Game Menu-----------"
            + "\nN - Start New Game"
            + "\nM - Full Map View"
            + "\nA - View Attribute Stats"
            + "\nS - Save Game"
            + "\n"
            + "\nR - Return to Current Game"
            + "\nQ - Return to Main Menu"
            + "\n**NOTE: typing G throughout your "
            + "game will take to you back this menu**"
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
            case 'N': // Start Game
                this.displayMap();
                break;           
            case 'A': // save/view Attribute Stats
                this.displayStatsView();
                break;
            case 'M': // View Full Map
                this.displayFullMap();
                break;
            case 'S': // save game
                this.saveGame();
                break;
            case 'Q': // View Return to Main Menu
               this.displayMainMenu();
               break;
            case 'R': // Closes program
                return true;
   
            default: // displays in any other instance
                ErrorView.display(this.getClass().getName(),
                        "!!--This is not a valid option, use the menu for a correct option--!!");
                break;
            
        }
        return false;
    }
        
    private void displayStatsView() {
            //display the Stats
            StatsView statsView = new StatsView("A");
            statsView.displayStats();
    }

    private void displayMap() {
            //display the Map View
            MapView mapView = new MapView("N");
            mapView.display();
    }

    private void displayFullMap() {
            //display the Map View
            FullMapView fullMapView = new FullMapView("M");
            fullMapView.displayFullMap();
    }
    
    private void saveGame() {
        System.out.println("\n\nEnter the file path for where the game"
                + "is to be saved.");
        String filePath = this.getInput();

        try {
            // save the game to the specified
            GameControl.saveGame(theGreatandSpaceousBuilding.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void displayMainMenu() {
         //return to Main Menu
         MainMenuView mainMenu = new MainMenuView();
         mainMenu.display();
   }   
}
