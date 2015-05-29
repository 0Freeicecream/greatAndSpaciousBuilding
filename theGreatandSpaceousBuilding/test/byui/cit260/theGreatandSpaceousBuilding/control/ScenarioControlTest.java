/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Randy
 */
public class ScenarioControlTest {
    
    public ScenarioControlTest() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
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
        int testimony = 2;
        int obedience = 1;
        int challengeRating = 3;
        int rand1 = 4;
        Integer expResult = 2; //expected output returned value
        
        //create instance of ScenarioControl class
        ScenarioControl instance = new ScenarioControl();
        
        //Call function to run test
        Integer result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand1);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
          /*
        * Test case #2
        */
        System.out.println("\tTest case #2");
        //input values for test case 1
        testimony = 100;
        obedience = 6;
        challengeRating = 4;
        rand1 = 7;
        expResult = null; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand1);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
            /*
        * Test case #3
        */
        System.out.println("\tTest case #3");
        //input values for test case 1
        testimony = 10;
        obedience = -4;
        challengeRating = 6;
        rand1 = 6;
        expResult = null; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand1);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
              /*
        * Test case #4
        */
        System.out.println("\tTest case #4");
        //input values for test case 1
        testimony = 3;
        obedience = 101;
        challengeRating = 8;
        rand1 = 7;
        expResult = null; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand1);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
                /*
        * Test case #5
        */
        System.out.println("\tTest case #5");
        //input values for test case 1
        testimony = 1;
        obedience = 1;
        challengeRating = 1;
        rand1 = 1;
        expResult = 0; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand1);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
                /*
        * Test case #6
        */
        System.out.println("\tTest case #6");
        //input values for test case 1
        testimony = 99;
        obedience = 99;
        challengeRating = 99;
        rand1 = 10;
        expResult = -89; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand1);
        
        //compare results to expectations
        assertEquals(expResult, result);
    }
    
    
}
