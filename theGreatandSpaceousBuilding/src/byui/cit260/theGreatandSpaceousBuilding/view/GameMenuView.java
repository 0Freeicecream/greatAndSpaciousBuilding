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
 * @author Ted
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("\n-----------Game Menu-----------"
            + "\nA - View Attributes"
            + "\nM - Move on Map"
            + "\nQ - Answer Quiz"
            + "\nC - Tackle Challenge"
            + "\n"
            + "\nR - Return to Main Menu"
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
            case 'A': // Create and start new.game
                this.displayAttributes();
                break;
            case 'M': // Saves current game
                this.displayMap();
                break;
            case 'Q': // restores and runs existing game
                this.displayQuiz();
                break;
            case 'C': // Loads the help menu
                this.displayChallengeSelection();
                break;
            case 'R': // Closes program so players can get to more important things
                return true;
            default: // displays in any other instance
                System.out.println("!!--This is not a valid option, use the menu for a correct option--!!");
                break;
            
        }
        return false;
    }
        
        private void saveGame() {
            System.out.println("--Your saveGame function is working perfectly--");
        }

    private void displayAttributes() {
            //display the Attributes menu
            AttributeMenuView attributeMenu = new AttributeMenuView();
            attributeMenu.display();
    }

    private void displayMap() {
            //display the Map View
            MapView mapView = new MapView();
            mapView.displayPrompts();
    }

    private void displayQuiz() {
            //display the Quiz View
        System.out.println("Answer the following question:\n");
            QuizView quizView = new QuizView();
            quizView.display();
    }

    private void displayChallengeSelection() {
            //display the Map View
            ChallengeSelectionView challengeSelectionView = new ChallengeSelectionView();
            challengeSelectionView.display();
    }
     
}
