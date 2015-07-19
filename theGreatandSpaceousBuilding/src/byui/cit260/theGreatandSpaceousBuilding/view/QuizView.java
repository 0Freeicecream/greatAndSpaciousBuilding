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
import byui.cit260.theGreatandSpaceousBuilding.control.MapControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Game;
import byui.cit260.theGreatandSpaceousBuilding.model.Map;
import static java.lang.System.console;




/**
 *
 * @author Ted Bell
 */
public class QuizView extends View {
    boolean isRight;
    //Get informaiton from Location
    MapControl mapControl = new MapControl();
    
    Game game = theGreatandSpaceousBuilding.getCurrentGame();
    Map map = game.getMap();
    
    //this.console.println();
    Location[][] locs = map.getLocations();
    Double x = new Double(game.getPlayerCoordinatesX());
    Double y = new Double(game.getPlayerCoordinatesY());
//    Location location = mapControl.getLocations();
    Location location = locs[x.intValue()][y.intValue()];
    private final String quiz = this.location.getScene().getQuestion();
    private final String story = this.location.getScene().getStory();
    char answer = this.location.getScene().getAnswer();
    
    public QuizView(){
        super("/n/nAnswer the following question:/n");
    }
   
    public boolean quizOutcome() {
        System.out.println(story);
        System.out.println(quiz);
        this.display();

        
        return isRight;
    }
    
   
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
        if (choice == answer) {
            this.console.println("\n\nYou answered correctly");
            isRight = true;          
        }
        else {
            isRight = true;
            this.console.println("\n\nYou chose poorly.");
            // hands off to Challenge View
            ChallengeSelectionView challengeSelectionView = new ChallengeSelectionView();
            challengeSelectionView.display();
        }
        return isRight;
        
    }
}
