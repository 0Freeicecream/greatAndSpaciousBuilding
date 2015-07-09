/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.AttributeControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import java.util.Scanner;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;

/**
 *
 * @author Néna
 */
public class AttributeMenuView extends View {
    
        public AttributeMenuView() {
        super("\n----------Pick an attribute----------"
            + "\nWhen you win or lose a challenge,"
            + "\n1 point will be added or subtracted"
            + "\nfrom your selected attribute"
            + "\nF - Fruit"
            + "\nT - Testimony"
            + "\nO - Obedience"
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
        AttributeControl attributeControl = new AttributeControl();
        boolean isValid = false;
        switch (value) {
            case "F":
            attributeControl.selection = 'F';    
            // Choose Fruit
                //Set some control variable to Fruit
                //Call the challenge
                this.displayFruit();
                isValid = true;
                break;
            case "T":
              attributeControl.selection = 'T';// Choose Testimony
                 //Set some control variable to Testimony
                //Call the challenge
                this.displayTestimony();
                isValid = true;
                break;
            case "O":
            attributeControl.selection = 'O';// Choose Obedience
                 //Set some control variable to Obedience
                //Call the challenge
                this.displayObedience();
                isValid = true;
                break;
            case "6":
                StatsView statsview = new StatsView();
                statsview.displayStats();
                break;
            default: // displays in any other instance
                System.out.println("!!--This is not a valid option, use the menu for a correct option--!!");
                break;
        }
       
        if (isValid) {
            QuizView quizview = new QuizView();
            boolean isRight = quizview.quizOutcome();
            Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
            if (isRight == true) {
                if (attributeControl.selection == 'T') {
                    attributes.setTestimony(attributes.getTestimony() + 1);
                }
                else if (attributeControl.selection == 'O') {
                    attributes.setObedience(attributes.getObedience() + 1);
                }
                else if (attributeControl.selection == 'F') {
                    attributes.setFruit(attributes.getFruit() + 1);
                }
                theGreatandSpaceousBuilding.setAttributes(attributes);
                // Increment the chosen attribute
            }
            else {
                ChallengeSelectionView challengeselectionview = new ChallengeSelectionView();
                boolean isSuccessful = challengeselectionview.doChallenge();
                if (attributeControl.selection == 'T') {
                    if (isSuccessful == true) {
                        attributes.setTestimony(attributes.getTestimony() + 1);
                    }
                    else {
                        attributes.setTestimony(attributes.getTestimony() - 1);
                    }
                }
                else if (attributeControl.selection == 'O') {
                    if (isSuccessful == true) {
                        attributes.setObedience(attributes.getObedience() + 1);
                    }
                    else {
                        attributes.setObedience(attributes.getObedience() - 1);
                    }
                }
                else if (attributeControl.selection == 'F') {
                    if (isSuccessful == true) {
                        attributes.setFruit(attributes.getFruit() + 1);
                    }
                    else {
                        attributes.setFruit(attributes.getFruit() - 1);
                    }
                }
            }
            MapView mapview = new MapView("");
            mapview.displayPrompts(); // hands off to Map View  
        }
        
        return isValid;
    }  
        private void displayFruit() {
            System.out.println("--You've waged 1 point to Fruit--");
        }
        
        private void displayTestimony() {
            System.out.println("--You've waged 1 point to Testimony--");
        }
    
        private void displayObedience() {
            System.out.println("--You've waged 1 point to Obedience--");
}
}