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
            + "\n6 - View Attributes Stats"
            + "\nM - Move on Map"
            + "\n7 - View Full Map"
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
            case 'M': // Move on Map
                this.displayMap();
                break;
            case 'Q': // Answer Quiz
                this.displayQuiz();
                break;
            case 'C': // Challenge
                this.displayChallengeSelection();
                break;
            case '6': // View Attribute Stats
                this.displayStatsView();
                break;
            case '7': // View Full Map
                this.displayFullMap();
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

    private void displayStatsView() {
            //display the Stats
            StatsView statsView = new StatsView();
            statsView.displayStats();
    }

    private void displayMap() {
            //display the Map View
            MapView mapView = new MapView();
            mapView.displayPrompts();
    }

    private void displayFullMap() {
            //display the Map View
            FullMapView fullMapView = new FullMapView();
            fullMapView.displayFullMap();
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
