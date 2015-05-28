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
    
    public int fingerOfScorn(int testimony, int obedience, int challengeRating) {
        double randA = Math.random() * 9 + 1;
        double randB = Math.random() * 9 + 1;
        int rand1 = (int) randA;
        int rand2 = (int) randB;
        
        
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
            
            return (testimony + rand1  - (challengeRating + rand2 - obedience));
    }
}
