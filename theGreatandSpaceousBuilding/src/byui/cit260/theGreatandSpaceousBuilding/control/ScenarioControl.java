/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import java.util.Random;
/**
 *
 * @author Néna and Ted
 */
public class ScenarioControl {
    
    public class Random {
        private int randNum() {
            Random rn = new Random();
            int num = rn.nextInt(10) + 1;
            return num;
        }

        private int nextInt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    public int fingerOfScorn(int testimony, int obedience, int challengeRating) {
        if (testimony > 99) {
            //Error – Testimony too high
            return -1;
        } else if (testimony < 1) {
            //Error – testimony too low
            return -1;
        } else if (obedience > 99) {
            //Error – obedience too high
            return -1;
        } else if (obedience < 1) {
            //Error – obedience too low
            return -1;
        } else if (challengeRating > 99) {
            //Error – obedience too high
            return -1;
        } else if (challengeRating < 1) {
            //Error – obedience too low
            return -1;
        } else
            return (testimony + num1 ) - (challengeRating + Math.random() - obedience);
    }
    
    
}
