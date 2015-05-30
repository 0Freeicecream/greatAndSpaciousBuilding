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
 * @author Ted Bell & Nena Riley
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
        int rand = 4;
        Integer expResult = 4; //expected output returned value
        
        //create instance of ScenarioControl class
        ScenarioControl instance = new ScenarioControl();
        
        //Call function to run test
        Integer result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand);
        
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
        rand = 7;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand);
        
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
        rand = 6;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand);
        
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
        rand = 7;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand);
        
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
        rand = 1;
        expResult = 2; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand);
        
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
        rand = 10;
        expResult = 109; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.fingerOfScorn(testimony, obedience, challengeRating, rand);
        
        //compare results to expectations
        assertEquals(expResult, result);
    }

    /**
     * Test of pride method, of class ScenarioControl.
     */
    @Test
    public void testPride() {
        /*
        *  Test Case #1
        */
        System.out.println("pride");
        System.out.println("\tTest case #1");
        int testimony = 11;
        int obedience = 12;
        int challengeRating = 73;
        int x = 4;
        int rand = 1;
        ScenarioControl instance = new ScenarioControl();
        Integer expResult = -53;
        Integer result = instance.pride(testimony, obedience, challengeRating, rand, x);
        assertEquals(expResult, result, 1);
        
        /*
        * Test case #2
        */
        System.out.println("\tTest case #2");
        //input values for test case 2
        testimony = 100;
        obedience = 26;
        challengeRating = 8;
        x = 3;
        rand = 1;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
            /*
        * Test case #3
        */
        System.out.println("\tTest case #3");
        //input values for test case 3
        testimony = 0;
        obedience = 26;
        challengeRating = 8;
        x = 3;
        rand = 1;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
        /*
        * Test case #4
        */
        System.out.println("\tTest case #4");
        //input values for test case 4
        testimony = 50;
        obedience = 100;
        challengeRating = 88;
        x = 2;
        rand = 7;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
        /*
        * Test case #5
        */
        System.out.println("\tTest case #5");
        //input values for test case 5
        testimony = 37;
        obedience = 0;
        challengeRating = 34;
        x = 4;
        rand = 1;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
        /*
        * Test case 6
        */
        System.out.println("\tTest case #6");
        //input values for test case 6
        testimony = 18;
        obedience = 90;
        challengeRating = 100;
        x = 4;
        rand = 1;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
        /*
        * Test case 7
        */
        System.out.println("\tTest case #7");
        //input values for test case 7
        testimony = 81;
        obedience = 28;
        challengeRating = 0;
        x = 3;
        rand = 1;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 8
        */
        System.out.println("\tTest case #8");
        //input values for test case 8
        testimony = 63;
        obedience = 41;
        challengeRating = 82;
        x = 0;
        rand = 1;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 9
        */
        System.out.println("\tTest case #9");
        //input values for test case 9
        testimony = 82;
        obedience = 22;
        challengeRating = 72;
        rand = 5;
        x = 11;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 10
        */
        System.out.println("\tTest case #10");
        //input values for test case 10
        testimony = 5;
        obedience = 45;
        challengeRating = 65;
        x = 2;
        rand = 0;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 11
        */
        System.out.println("\tTest case #11");
        //input values for test case 11
        testimony = 5;
        obedience = 45;
        challengeRating = 65;
        x = 2;
        rand = 11;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 12
        */
        System.out.println("\tTest case #12");
        //input values for test case 12
        testimony = 10;
        obedience = 45;
        challengeRating = 65;
        x = 2;
        rand = 5;
        expResult = -7; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        // Print individual bits of code for test porpoises
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 13
        */
        System.out.println("\tTest case #13");
        //input values for test case 13
        testimony = 99;
        obedience = 29;
        challengeRating = 45;
        x = 2;
        rand = 5;
        expResult = 86; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 14
        */
        System.out.println("\tTest case #14");
        //input values for test case 14
        testimony = 39;
        obedience = 1;
        challengeRating = 63;
        x = 4;
        rand = 5;
        expResult = -22; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 15
        */
        System.out.println("\tTest case #15");
        //input values for test case 15
        testimony = 5;
        obedience = 99;
        challengeRating = 57;
        x = 3;
        rand = 5;
        expResult = 49; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 16
        */
        System.out.println("\tTest case #16");
        //input values for test case 16
        testimony = 18;
        obedience = 84;
        challengeRating = 1;
        x = 4;
        rand = 5;
        expResult = 102; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 17
        */
        System.out.println("\tTest case #17");
        //input values for test case 17
        testimony = 39;
        obedience = 47;
        challengeRating = 99;
        x = 4;
        rand = 5;
        expResult = -12; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 18
        */
        System.out.println("\tTest case #18");
        //input values for test case 18
        testimony = 6;
        obedience = 38;
        challengeRating = 28;
        x = 1;
        rand = 5;
        expResult = 20; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 19
        */
        System.out.println("\tTest case #19");
        //input values for test case 19
        testimony = 4;
        obedience = 68;
        challengeRating = 50;
        x = 5;
        rand = 5;
        expResult = 22; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 20
        */
        System.out.println("\tTest case #20");
        //input values for test case 20
        testimony = 4;
        obedience = 68;
        challengeRating = 50;
        x = 3;
        rand = 1;
        expResult = 20; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

        /*
        * Test case 21
        */
        System.out.println("\tTest case #21");
        //input values for test case 20
        testimony = 4;
        obedience = 68;
        challengeRating = 50;
        x = 3;
        rand = 10;
        expResult = 29; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.pride(testimony, obedience, challengeRating, rand, x);
        
        //compare results to expectations
        assertEquals(expResult, result);

    
    }
    /**
     * Test of mistsOfDarkness method, of class ScenarioControl.
     */
    @Test
    public void testMistsOfDarkness (){
        System.out.println("mistsOfDarkness");
        
        /*
        * Test case #1
        */
        System.out.println("\tTest case #1");
        //input values for test case 1
        int testimony = 11;
        int obedience = 12;
        int challengeRating = 73;
        int rand = 1;
        int y = 4;
        Integer expResult = -53; //expected output returned value
        
        //create instance of ScenarioControl class
        ScenarioControl instance = new ScenarioControl();
        
        //Call function to run test
        Integer result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
        
        /*
        * Test case #2
        */
        System.out.println("\tTest case #2");
        //input values for test case 1
        testimony = 100;
        obedience = 26;
        challengeRating = 8;
        rand = 2;
        y = 3;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #3
        */
        System.out.println("\tTest case #3");
        //input values for test case 1
        testimony = 0;
        obedience = 54;
        challengeRating = 15;
        rand = 3;
        y = 2;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #4
        */
        System.out.println("\tTest case #4");
        //input values for test case 1
        testimony = 50;
        obedience = 100;
        challengeRating = 88;
        rand = 4;
        y = 2;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #5
        */
        System.out.println("\tTest case #5");
        //input values for test case 1
        testimony = 37;
        obedience = 0;
        challengeRating = 34;
        rand = 5;
        y = 4;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #6
        */
        System.out.println("\tTest case #6");
        //input values for test case 1
        testimony = 18;
        obedience = 90;
        challengeRating = 100;
        rand = 6;
        y = 4;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #7
        */
        System.out.println("\tTest case #7");
        //input values for test case 1
        testimony = 81;
        obedience = 28;
        challengeRating = 0;
        rand = 7;
        y = 3;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #8
        */
        System.out.println("\tTest case #8");
        //input values for test case 1
        testimony = 63;
        obedience = 41;
        challengeRating = 82;
        rand = 8;
        y = 0;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #9
        */
        System.out.println("\tTest case #9");
        //input values for test case 1
        testimony = 82;
        obedience = 22;
        challengeRating = 72;
        rand = 9;
        y = 6;
        expResult = -1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #10
        */
        System.out.println("\tTest case #10");
        //input values for test case 1
        testimony = 1;
        obedience = 1;
        challengeRating = 1;
        rand = 1;
        y = 1;
        expResult = 1; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
         /*
        * Test case #11
        */
        System.out.println("\tTest case #11");
        //input values for test case 1
        testimony = 99;
        obedience = 99;
        challengeRating = 99;
        rand = 10;
        y = 5;
        expResult = 104; //expected output returned value
        
        //create instance of ScenarioControl class
        instance = new ScenarioControl();
        
        //Call function to run test
        result = instance.mistsOfDarkness(testimony, obedience, challengeRating, rand, y);
        
        //compare results to expectations
        assertEquals(expResult, result);
        
    }
        
    }



