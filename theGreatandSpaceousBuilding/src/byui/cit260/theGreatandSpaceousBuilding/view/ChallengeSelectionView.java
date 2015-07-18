/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;


import byui.cit260.theGreatandSpaceousBuilding.control.SceneControl;
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
            case 'F': // Runs finger of scorn
                choice("fOS");
                isValid = true;
                break;
            case 'P': // runs pride
                choice("Pride");
                isValid = true;
                break;
            case 'M': // runs mists of darkness
                choice("mOD");
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
    
    private void choice(String type) {
        SceneControl sceneControl = new SceneControl();
        if (sceneControl.challengeSelection(type)) {
            System.out.println("\nyou succeed!");
        } else {
            System.out.println("\nYou fail, and loose 1 fruit.");
            int num = attributes.getFruit();
            attributes.setFruit(num - 1);
        }
    }

    private void randomChallenge() {
        // Rolls a random number between 0 and 2
        double randA = Math.random() * 2;
        int randB = (int) randA;
        switch(randB) {
            case 0:
                choice("fOS");
                break;
            case 1:
                choice("Pride");
                break;
            case 2:
                choice("mOD");
                break;
             default: // displays in any other instance
                ErrorView.display(this.getClass().getName(),
                        "!!--The Random Challenge Function has encountered an issue--!!");
                break;    
        }
    }
}
