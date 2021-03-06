/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import java.util.Scanner;
import byui.cit260.theGreatandSpaceousBuilding.view.ErrorView;
/**
 *
 * @author Ted
 */
public class HelpMenuView extends View {
    
        public HelpMenuView(){
        super("\n-----------Help Menu-----------"
            + "\nG - Goal"
            + "\nM - Moving across the Gameboard"
            + "\nC - Challenges and Quizes"
            + "\nA - Attributes"
            + "\nB - Back to Main Menu"
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
            case 'G': // Create and start new.game
                this.displayGoals();
                break;
            case 'M': // Saves current game
                this.displayMoving();
                break;
            case 'C': // restores and runs existing game
                this.displayChallengesQuiz();
                break;
            case 'A':
                 this.displayAttributes();
                break;
            case 'B': // Closes program so players can get to more important things
                return true;
            default: // displays in any other instance
                ErrorView.display(this.getClass().getName(),
                        "!!--This is not a valid option, use the menu for a correct option--!!");
                break;
            
        }
            return false;
    }    

    private void displayGoals() {
        this.console.println("\n**********************************\n"
        + "The Great and Spacious Building is a text based role playing game\n"
        + "in which you will have to journey through life making personal choices\n"
        + "that will lead you across the dark and dreary wil-derness, until the\n"
        + "player reaches the tree of life and obtains eternal life.\n" +
        " \n"
        + "In this journey, you will start with 5 fruit as health, the testimony\n"
        + "level has 5 points, and the obedi-ence level has 5 points also.\n"
        + "As you travel through the map you will face challenges, answer\n"
        + "questions, riddles, and brain teasers to earn more fruits. \n"
        + "For every correct answer, the player is awarded fruit for providing \n"
        + "a correct answer or winning a challenge.  For incorrect answers,\n"
        + "the player must face a challenge, and battle to determine if they will\n"
        + "win or lose more fruit. When the player reaches the tree of life with\n"
        + "any number of fruit other than zero, he obtains eternal life.\n"
        + "If the fruit drops below zero, the player dies.");
    }

    private void displayMoving() {
        this.console.println("\n**********************************\n"
        + "At the end of each turn, you have the option to move closer to\n"
        + "the tree of life, or you can move across the land north or south of the land.\n"
        + "\n"
        + "Remember: The further you are across the map, the harder the questions will be,\n"
        + "and where you are on the map can make the challenges harder if you answer wrong.");
    }
    
    private void displayAttributes(){
        this.console.println("\n**********************************\n"
        + "\n During the game you can view your attributes stats"
        + "\n at any time by typing \"6\"");
    }

    private void displayChallengesQuiz() {
       this.console.println("\n**********************************\n"
        + "On each space, you will be asked a multiple choice question based on\n"
        + "stories from the Book of Mormon.  Answer correctly, and you will be\n"
        + "rewarded with fruit and attributes, answer wrong and you will be \n"
        + "faced with a challenge.\n"
        + "\n"
        + "During a challenge, you must use your testimony and obedience you've\n"
        + "earned to overcome the Challenge Rating.  Testimony helps you overcome\n"
        + "challenges, while Obedience lowers the Challenge Rating.\n"
        + "If you fail to overcome the challenge, you lose one fruit.\n"
        + "If you run out of fruit, your journey to the tree of life ends.");
    }
    
}
