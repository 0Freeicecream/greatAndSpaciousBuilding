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
public class QuizView extends View {
    
    public QuizView(){
        super("\nThis is an example test, the correct answer is Candy"
        + "\nA. Zubat"
        + "\nB. Candy Crush Saga"
        + "\nC. Candy"
        + "\nD. I don't have a fourth option, I just thought I'd impress you"
        + "\n");
    }
    
    private final char ANSWER = 'C';
    
    void quizView() {
        char guess = answerQuiz();
        if (guess == ANSWER) {
            System.out.println("\n\nYou answered correctly, you gain x Fruit!");
        } else {
            System.out.println("\n\nYou chose poorly.");
        }
        
    }
    
    char answerQuiz() {
        char selection = ' ';
        // Prints Quiz
        System.out.println(promptMessage);
        
        // Get's user's guess from the possible answers
        String input = this.getInput(); //Gets user input
        input = input.toUpperCase();
        selection = input.charAt(0); //Get first character of string
        
        return selection;    
    }
        
        
}
