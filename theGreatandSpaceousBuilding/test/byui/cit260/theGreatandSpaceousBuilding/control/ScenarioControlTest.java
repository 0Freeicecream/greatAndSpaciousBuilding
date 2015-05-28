/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Randy
 */
public class ScenarioControlTest {
    
    public ScenarioControlTest() {
    }

    /**
     * Test of fingerOfScorn method, of class ScenarioControl.
     */
    @Test
    public void testFingerOfScorn() {
        System.out.println("fingerOfScorn");
        
        /*
        * Test case #1
        */
        System.out.println("\tTest case #1");
        //input values for test case 1
        int testimony = 0;
        int obedience = 0;
        int challengeRating = 0;
        ScenarioControl instance = new ScenarioControl();
        int expResult = 0;
        int result = instance.fingerOfScorn(testimony, obedience, challengeRating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
