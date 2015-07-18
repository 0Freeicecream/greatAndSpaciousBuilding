/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import byui.cit260.theGreatandSpaceousBuilding.model.Location;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;

/**
 *
 * @author Néna and Ted
 */
public class SceneControl {
    
    // Get's type of challenge chosen and selects a function to run
    public boolean challengeSelection(String type) {
        // Get's Attributes from the player's attributes
        Attributes attributes = theGreatandSpaceousBuilding.getAttributes();
        int tes = attributes.getTestimony();
        int obd = attributes.getObedience();
        Player player = theGreatandSpaceousBuilding.getPlayer();
        int x = player.getX();
        int y = player.getY();
        int rand = roll();
        boolean result;
        switch(type) {
            case "fOS": //Finger of Scorn
                result = fingerOfScorn(tes, obd, 5, rand) > 5;
                break;
            case "Pride":
                result = pride(tes, obd, 5, rand, x) > 5;
                break;
            case "mOD":
                result = mistsOfDarkness(tes, obd, 5, rand, y) > 5;
                break;
            default:
                result = false;
        }
        return result;
    }
    
       private int roll() {

        double randA = Math.random() * 9 + 1; //rolls a random number and multiplies it by 10(+1)
        return (int) randA;
    }
       
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
        System.out.println("\nYour BR = " + testimony + rand);
        System.out.println("\nThe Challenge Rating is " + (challengeRating - obedience) + "(" + challengeRating + ")");
        System.out.println("\nAgainst the challenge, you...");
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
     
    public Integer mistsOfDarkness (int testimony, int obedience, int challengeRating, int rand, int y){
        
        if (testimony > 99) {
            //Error - testimony too high
            return -1;
        } else if (testimony < 1) {
            //Error - testimony too low
            return -1;
        } else if (obedience > 99) {
	    //Error – obedience too high
            return  -1;
        } else if (obedience < 1) {
            //Error – obedience too low
            return -1;
        } else if (challengeRating > 99) {
            //Error – obedience too high
            return -1;
        } else if (challengeRating < 1) {
            //Error – obedience too low
            return -1;
        } else if (y < 1) {
            //Error – Y Coordinate too low
            return  -1;
        } else if (y > 5) {
            //Error – Y Coordinate too high
            return -1;
        } else
            return (testimony + rand) - ((challengeRating + y) - obedience);


       }
}

