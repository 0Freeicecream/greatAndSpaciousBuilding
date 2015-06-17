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
            + "F -  Finger of Scorn"
            + "P - Pride"
            + "M - Mists of Darkness"
            + "R - Random Challenge\n");
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
