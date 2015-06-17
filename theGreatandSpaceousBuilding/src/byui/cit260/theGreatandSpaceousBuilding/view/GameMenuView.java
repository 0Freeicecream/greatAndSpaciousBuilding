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
        super("\n-----------Main Menu-----------"
            + "\nA - View Attributes"
            + "\nM - Move on Map"
            + "\nQ - Answer Quiz"
            + "\nC - Tackle Challenge"
            + "\n"
            + "\nR - Return to Main Menu"
            + "\n-------------------------------");
    }

    void display() {
        char selection;
        do {
            
            System.out.println(promptMessage); // displays the main menu
            
            String input = this.getInput(); //Gets user input
            input = input.toUpperCase();
            selection = input.charAt(0); //Get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection != 'R'); // selection is not exit
        
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
                return;
            default: // displays in any other instance
                System.out.println("!!--This is not a valid option, use the menu for a correct option--!!");
                break;
            
        }
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
            quizView.quizView();
    }

    private void displayChallengeSelection() {
            //display the Map View
            ChallengeSelectionView challengeSelectionView = new ChallengeSelectionView();
            challengeSelectionView.display();
    }
     
}
