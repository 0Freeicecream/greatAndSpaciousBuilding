/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Néna
 */
public class TopScoreControlTest {
    
    public TopScoreControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getScore method, of class TopScoreControl.
     */
    @Test
    public void testGetScore() {
        
        //Test Case #1
        System.out.println("Test Case #1");
        int fruit = 4;
        int testimony = 10;
        int obedience = 5;
        TopScoreControl instance = new TopScoreControl();
        int expResult = 19;
        int result = instance.getScore(fruit, testimony, obedience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Success!");
    
        
        //Test Case #2
        System.out.println("Test Case #2");
         fruit = 6;
         testimony = 120;
         obedience = 25;
         expResult = 151;
         result = instance.getScore(fruit, testimony, obedience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Success!");
    
         //Test Case #3
        System.out.println("Test Case #3");
         fruit = 0;
         testimony = 7;
         obedience = 30;
         expResult = 37;
         result = instance.getScore(fruit, testimony, obedience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Success!");
        
         //Test Case #4
        System.out.println("Test Case #4");
         fruit = 19;
         testimony = 6;
         obedience = 101;
         expResult = 126;
         result = instance.getScore(fruit, testimony, obedience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Success!");
        
         //Test Case #5
        System.out.println("Test Case #5");
         fruit = 1;
         testimony = 1;
         obedience = 1;
         expResult = 3;
         result = instance.getScore(fruit, testimony, obedience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Success!");
        
        
        //Test Case #6
        System.out.println("Test Case #6");
         fruit = 99;
         testimony = 99;
         obedience = 99;
         expResult = 297;
         result = instance.getScore(fruit, testimony, obedience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Success!");
    }
}
