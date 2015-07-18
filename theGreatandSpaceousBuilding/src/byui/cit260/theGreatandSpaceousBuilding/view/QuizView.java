/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;


/**
 *
 * @author Ted Bell
 */
public class QuizView extends View {
    boolean isRight;
    public QuizView(){
        super("\n Please Answer the Following Question:"
        +"\n"
        + "This is an example test, the correct answer is Candy"
        + "\nA. Zubat"
        + "\nB. Candy Crush Saga"
        + "\nC. Candy"
        + "\nD. I don't have a fourth option, I just thought I'd impress you"
        + "\n");
    }
   
    public boolean quizOutcome() {
        this.display();
        
        return isRight;
    }
    
    private final char ANSWER = 'C';
    
    @Override
    public boolean doAction(Object obj) {
        if (super.doAction(obj)) {
            return false;
        };
        //Defines obj String for Superclass
        String value = (String) obj;
        // convert to Uppercase
        value = value.toUpperCase();
        //get first character entered
        char choice = value.charAt(0);
        if (choice == ANSWER) {
            this.console.println("\n\nYou answered correctly, you gain x Attribute");
            isRight = true;          
        } 
        else {
            isRight = false;
            this.console.println("\n\nYou chose poorly.");
            
            //ChallengeSelectionView challengeselectionview = new ChallengeSelectionView();
            //challengeselectionview.display(); // hands off to Challenge View
          
        }
        return true;
        
    }
        
        
}
