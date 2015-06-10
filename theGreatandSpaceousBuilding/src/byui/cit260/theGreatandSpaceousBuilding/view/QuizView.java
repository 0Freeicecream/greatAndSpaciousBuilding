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
public class QuizView {
    
    private final String QUIZ = 
            "\nThis is an example test, the correct answer is Candy"
            + "\nA. Zubat"
            + "\nB. Candy Crush Saga"
            + "\nC. Candy"
            + "\nD. I don't have a fourth option, I just thought I'd impress you"
            + "\n";
    
    private final char ANSWER = 'C';
    
    boolean answerQuiz(char ANSWER) {
        
        char selection = ' ';
        
        // Prints Quiz
        System.out.println(QUIZ);
        
        // Get's user's guess from the possible answers
        String input = this.getInput(); //Gets user input
        input = input.toUpperCase();
        selection = input.charAt(0); //Get first character of string
        
        //Compares Guess to Answer
        if (selection == ANSWER) {
            // Prints congradulation
            System.out.println("That's correct, you gain Fruit");
        } else {
            // Prints Failure Message
            System.out.println("You chose poorly");
        } 
        // Returns result of the quiz
            return selection == ANSWER;
    }
    
        String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); // Use keyboard input
        
        while(!valid) { //while a valid name is not retrived
            
            // Demands data from keyboard and trims off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            selection = selection.toUpperCase();
            
            //If name is invalid (less than two character in length)
            if (selection != "A" || selection != "B" || selection != "C" || selection != "D") {
                System.out.println("Invalid command, must be A B C or D");
                continue; // repeats
            }
            break; // out of the exit repitition
        }
        
        return selection; //Yell players selection into code
    }
        
        
}
