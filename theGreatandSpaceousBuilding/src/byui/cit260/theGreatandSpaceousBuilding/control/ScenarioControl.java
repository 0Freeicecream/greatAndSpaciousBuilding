/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

/**
 *
 * @author Néna and Ted
 */
public class ScenarioControl {
    
        private int roll() {

            double randA = Math.random() * 9 + 1;
            return (int) randA;
        }
    int rand = roll();

   
    public Integer fingerOfScorn(int testimony, int obedience, int challengeRating, int rand) {
        
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
        } else if (rand > 10) {
            //Error – obedience too high
            return -1;
        } else if (rand < 1) {
            //Error – obedience too low
            return -1;
        } else
            
            return (testimony + rand)  - (challengeRating - obedience);
    }    
    
     public Integer pride(int testimony, int obedience, int challengeRating, int rand, int x) {
        
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
        } else if (rand > 10) {
            //Error – obedience too high
            return -1;
        } else if (rand < 1) {
            //Error – obedience too low
            return -1;
        } else if (x > 5) {
            //Error – x too high
            return -1;
        } else if (x < 1) {
            //Error – x too low
            return -1;
        } else
            return (testimony + rand) - ((challengeRating + x) - obedience);
    }
}
