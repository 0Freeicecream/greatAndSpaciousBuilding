/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.control.AttributeControl;
import java.util.Scanner;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;

/**
 *
 * @author Néna
 */
public class AttributeMenuView {
    
    private final String ATTRIBUTE_MENU =
              "\n----------Pick an attribute----------"
            + "\nWhen you win or lose a challange,"
            + "\n1 point will be added or subtracted"
            + "\nfrom your selected attribute"
            + "\nF - Fruit"
            + "\nT - Testimony"
            + "\nO - Obedience"
            + "\n-------------------------------";
            

    void displayMenu() {
        char selection;
        do {
            
            System.out.println(ATTRIBUTE_MENU); // displays the attribute menu
            
            String input = this.getInput(); //Gets user input
            input = input.toUpperCase();
            selection = input.charAt(0); //Get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection != 'F' || selection != 'T' || selection != 'O'); // selection is not correct
        
    }

    String getInput() {
        boolean valid = false; // indicates if the selection has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); // Use keyboard input
        
        while(!valid) { //while a valid selection is not retrived
            
            // Demands data from keyboard and trims off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            //If selection is invalid ( not F, T, or O
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
            case 'F':
            byui.cit260.theGreatandSpaceousBuilding.control.AttributeControl.selection = 'F';    
            // Choose Fruit
                //Set some control variable to Fruit
                //Call the challenge
                this.displayFruit();
                break;
            case 'T':
              byui.cit260.theGreatandSpaceousBuilding.control.AttributeControl.selection = 'T';// Choose Testimony
                 //Set some control variable to Testimony
                //Call the challenge
                this.displayTestimony();
                break;
            case 'O':
            byui.cit260.theGreatandSpaceousBuilding.control.AttributeControl.selection = 'O';// Choose Obedience
                 //Set some control variable to Obedience
                //Call the challenge
                this.displayObedience();
                break;
            default: // displays in any other instance
                System.out.println("!!--This is not a valid option, use the menu for a correct option--!!");
                break;
        }
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