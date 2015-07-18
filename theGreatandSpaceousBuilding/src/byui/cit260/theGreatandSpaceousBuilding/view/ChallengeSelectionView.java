/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;


/**
 *
 * @author Ted Bell
 */
public class ChallengeSelectionView extends View {
    boolean isSuccessful;
    public ChallengeSelectionView() {
        super("\nBecause you've failed the quiz, you must face a challenge.\n"
            + "\nF - Finger of Scorn"
            + "\nP - Pride"
            + "\nM - Mists of Darkness"
            + "\nR - Random Challenge\n");
    }
    
    public boolean doChallenge() {
        this.display();
        return isSuccessful;
    }
    
    @Override
    public boolean doAction(Object obj) {
        if (super.doAction(obj)) {
            return false;
        }
        //Defines obj String for Superclass
        String value = (String) obj;
        // convert to Uppercase
        value = value.toUpperCase();
        //get first character entered
        char choice = value.charAt(0);
        boolean isValid = false;
        switch (choice) {
            case 'F': // Create and start new.game
                this.fingerOfScorn();
                isValid = true;
                break;
            case 'P': // Saves current game
                this.pride();
                isValid = true;
                break;
            case 'M': // restores and runs existing game
                this.mistsOfDarkness();
                isValid = true;
                break;
            case 'R': // Loads the help menu
                this.randomChallenge();
                isValid = true;
                break;
            case '6':
                StatsView statsview = new StatsView("");
                statsview.displayStats();
                break;
            default: // displays in any other instance
                ErrorView.display(this.getClass().getName(),
                        "!!--This is not a valid option, use the menu for a correct option--!!");
                break;

        }
    
        return isValid;
    }

    private void fingerOfScorn() {
        this.console.println("---fingerOfScorn() is active---");
    }

    private void pride() {
        this.console.println("---pride() is active---");
    }

    private void mistsOfDarkness() {
        this.console.println("---mistsOfDarkness() is active---");
    }

    private void randomChallenge() {
        this.console.println("---randomChallenge() is active---");
    }
}
