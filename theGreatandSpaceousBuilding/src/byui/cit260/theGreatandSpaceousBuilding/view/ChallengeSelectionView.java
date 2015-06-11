/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.util.Scanner;

/**
 *
 * @author Ted Bell
 */
public class ChallengeSelectionView {
    
    private final String MENU =
              "\nBecause you've failed the quiz, you must face a challenge.\n"
            + "F -  Finger of Scorn"
            + "P - Pride"
            + "M - Mists of Darkness"
            + "R - Random Challenge\n";
            

    void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENU); // displays the main menu
            
            String input = this.getInput(); //Gets user input
            input = input.toUpperCase();
            selection = input.charAt(0); //Get first character of string
            
            this.doAction(selection); //do action based on selection
            
            } while (selection != '`'); // selection is not exit
        
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
            case 'F': // Create and start new.game
                this.fingerOfScorn();
                break;
            case 'P': // Saves current game
                this.pride();
                break;
            case 'M': // restores and runs existing game
                this.mistsOfDarkness();
                break;
            case 'R': // Loads the help menu
                this.randomChallenge();
                break;
            default: // displays in any other instance
                System.out.println("!!--This is not a valid option, use the menu for a correct option--!!");
                break;
            
        }
    }

    private void fingerOfScorn() {
        System.out.println("---fingerOfScorn() is active---");
    }

    private void pride() {
        System.out.println("---pride() is active---");
    }

    private void mistsOfDarkness() {
        System.out.println("---mistsOfDarkness() is active---");
    }

    private void randomChallenge() {
        System.out.println("---randomChallenge() is active---");
    }
}
