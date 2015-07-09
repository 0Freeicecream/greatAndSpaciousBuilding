/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;

import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import java.io.PrintWriter;
import java.io.BufferedReader;

/**
 *
 * @author Néna
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = theGreatandSpaceousBuilding.getOutFile();
    private static final PrintWriter logFile = theGreatandSpaceousBuilding.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                          "----------------------------------" 
                          + "\n-ERROR - " + errorMessage
                          + "\n----------------------------------");    
        
        //log eror
        logFile.println(className + " - " + errorMessage);
    }
    }
    
    

