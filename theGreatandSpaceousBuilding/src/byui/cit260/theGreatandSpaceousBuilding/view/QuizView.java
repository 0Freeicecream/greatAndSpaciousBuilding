/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import byui.cit260.theGreatandSpaceousBuilding.model.Location;
import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;


/**
 *
 * @author Ted Bell
 */
public class QuizView extends View {
    boolean isRight;
    //Get informaiton from Location
    Location location = theGreatandSpaceousBuilding.getLocation();
    private final String quiz = this.location.getScene().getQuestion();
    char answer = this.location.getScene().getAnswer();
    
    public QuizView(){
        super("/n/nAnswer the following question:/n");
    }
   
    public boolean quizOutcome() {
        this.display();
        System.out.println(quiz);
        
        return isRight;
    }
    
    @Override
    public boolean doAction(Object obj) {
        //Defines obj String for Superclass
        String value = (String) obj;
        // convert to Uppercase
        value = value.toUpperCase();
        //get first character entered
        char choice = value.charAt(0);
        if (choice == answer) {
            this.console.println("\n\nYou answered correctly, you gain x Attribute");
            isRight = true;          
        }
        else {
            isRight = false;
            this.console.println("\n\nYou chose poorly.");
            // hands off to Challenge View
            ChallengeSelectionView challengeSelectionView = new ChallengeSelectionView();
            challengeSelectionView.display();
        }
        return isRight;
        
    }
}