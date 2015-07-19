/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;
import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import byui.cit260.theGreatandSpaceousBuilding.view.MainMenuView;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;

/**
 *
 * @author Néna
 */
public class FinalScoreControl {

    
   public int getScore(int fruit, int testimony, int obedience){

        int[] scores = {fruit, 
                        testimony, 
                        obedience};
        int sum = 0;
        for (int score : scores) {
          sum += score;
        }

         return sum;
    }
}
