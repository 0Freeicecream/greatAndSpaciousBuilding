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
    
    public int roll() {
        
        double randA = Math.random() * 9 + 1;
        int rand1 = (int) randA;
        System.out.println(rand1);
        return rand1;
    }
    int rand1 = roll(); 
    
    public Integer fingerOfScorn(int testimony, int obedience, int challengeRating, int rand1) {
        
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
        } else if (rand1 > 10) {
            //Error – obedience too high
            return null;
        } else if (rand1 < 1) {
            //Error – obedience too low
            return null;
        } else
            
            return (testimony + rand1)  - (challengeRating - obedience);
    }    
    
     public Integer pride(int testimony, int obedience, int challengeRating, int x, int ran1) {
        
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
        } else if (rand1 > 10) {
            //Error – obedience too high
            return null;
        } else if (rand1 < 1) {
            //Error – obedience too low
            return null;
        } else if (x > 99) {
            //Error – obedience too high
            return null;
        } else if (x < 1) {
            //Error – obedience too low
            return null;
        } else
            
            return (testimony + rand1)  - (challengeRating + x - obedience);
    }
}
