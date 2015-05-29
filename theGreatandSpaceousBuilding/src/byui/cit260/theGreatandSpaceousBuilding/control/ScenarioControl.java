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
    
    public Integer fingerOfScorn(int testimony, int obedience, int challengeRating) {
        double randA = Math.random() * 9 + 1;
        int rand1 = (int) randA;
        return fingerOfScorn(testimony, obedience, challengeRating, rand1);
    }
    
    public Integer fingerOfScorn(int testimony, int obedience, int challengeRating, int rand1) {
       
        System.out.println(rand1);
        
        if (testimony > 99) {
            //Error – Testimony too high
            return null;
        } else if (testimony < 1) {
            //Error – testimony too low
            return null;
        } else if (obedience > 99) {
            //Error – obedience too high
            return null;
        } else if (obedience < 1) {
            //Error – obedience too low
            return null;
        } else if (challengeRating > 99) {
            //Error – obedience too high
            return null;
        } else if (challengeRating < 1) {
            //Error – obedience too low
            return null;
        } else
            
            return (testimony + rand1)  - (challengeRating + obedience);
    }
}
