/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.util.Scanner;

/**
 *
 * @author Néna
 */
public class MapView {
  
           
    void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println("You are at x,y "); // displays the location of the user
            
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
            case 'F': // Choose Fruit
                this.displayFruit();
                break;
            case 'T': // Choose Testimony
                this.displayTestimony();
                break;
            case 'O': // Choose Obedience
                this.displayObedience();
                break;
            default: // displays in any other instance
                System.out.println("!!--This is not a valid option, use the menu for a correct option--!!");
                break;
        }
    }

 
private void chooseAttribute(){
            GameControl.createNewGame(theGreatandSpaceousBuilding.getAttributes());
            
            //display the Attribute Menu
            AttributeMenuView attributeMenu = new AttributeMenuView();
            attributeMenu.displayMenu();
        }
        
        private void displayFruit() {
            System.out.println("--You've added 1 point to Fruit--");
        }
        
        private void displayTestimony() {
            System.out.println("--You've added 1 point to Testimony--");
        }
    
        private void displayObedience() {
            System.out.println("--You've added 1 point to Obedience--");
}
}