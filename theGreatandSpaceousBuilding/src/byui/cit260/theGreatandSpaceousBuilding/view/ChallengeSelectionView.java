/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;


import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
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
            + "\nM - Mists of Darkness");
    }
        Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
    
    public boolean doChallenge() {
        this.display();
        return isSuccessful;
    }
    
    @Override
    public boolean doAction(Object obj) {
        //Defines obj String for Superclass
        String value = (String) obj;
        // convert to Uppercase
        value = value.toUpperCase();
        //get first character entered
        char choice = value.charAt(0);
        boolean isValid = false;
        switch (choice) {
            case 'F': // Runs finger of scorn
                this.fingerOfScorn();
                isValid = true;
                break;
            case 'P': // runs pride
                this.pride();
                isValid = true;
                break;
            case 'M': // runs mists of darkness
                this.mistsOfDarkness();
                isValid = true;
                break;
            case 'R': // chooses a challenge at random
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
    
    private int roll() {

        double randA = Math.random() * 9 + 1;
        return (int) randA;
    }

    private void fingerOfScorn() {
        int tes = attributes.getTestimony();
        int obd = attributes.getObedience();
        int rand = roll();
        
        byui.cit260.theGreatandSpaceousBuilding.control.SceneControl.fingerOfScorn(tes, obd, 5, rand);
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
