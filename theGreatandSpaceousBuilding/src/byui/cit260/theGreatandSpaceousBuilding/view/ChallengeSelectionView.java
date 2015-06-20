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
public class ChallengeSelectionView extends View {
    
    public ChallengeSelectionView() {
        super("\nBecause you've failed the quiz, you must face a challenge.\n"
            + "\nF - Finger of Scorn"
            + "\nP - Pride"
            + "\nM - Mists of Darkness"
            + "\nR - Random Challenge\n");
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
        return false;
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
