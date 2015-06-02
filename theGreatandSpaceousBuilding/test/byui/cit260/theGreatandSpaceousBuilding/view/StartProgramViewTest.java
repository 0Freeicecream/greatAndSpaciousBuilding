/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Néna
 */
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of startProgram method, of class StartProgramView.
     */
    @Test
    public void testStartProgram() {
        System.out.println("getPlayersName");
        //input value for Test Case 1
        StartProgramView instance = new StartProgramView();
        String result = instance.getPlayerName();
        String expectedResult = "Fred Fredburger";
    }
    
}
