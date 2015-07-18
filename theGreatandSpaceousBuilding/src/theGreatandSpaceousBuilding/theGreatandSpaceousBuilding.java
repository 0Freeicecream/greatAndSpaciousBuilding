/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGreatandSpaceousBuilding;

import byui.cit260.theGreatandSpaceousBuilding.model.Challenge;
import byui.cit260.theGreatandSpaceousBuilding.model.Game;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Location;
import byui.cit260.theGreatandSpaceousBuilding.model.Map;
import byui.cit260.theGreatandSpaceousBuilding.model.Scene;
import byui.cit260.theGreatandSpaceousBuilding.view.StartProgramView;
import byui.cit260.theGreatandSpaceousBuilding.model.Attributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStreamReader;

/**
 *
 * @author Ted 
*/
public class theGreatandSpaceousBuilding{
    
    private static Game currentGame = null;
    public static Player player = null;
    private static Attributes attributes = null;
    private static Location location = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static void setLogFile(PrintWriter logFile) {
        theGreatandSpaceousBuilding.logFile = logFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }
    

    public static void setOutFile(PrintWriter outFile) {
        theGreatandSpaceousBuilding.outFile = outFile;
    }

    public static void setInFile(BufferedReader inFile) {
        theGreatandSpaceousBuilding.inFile = inFile;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }
    
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        theGreatandSpaceousBuilding.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        theGreatandSpaceousBuilding.player = player;
    }

    public static Attributes getAttributes() {
        return attributes; 
    }
     
    public static void setAttributes(Attributes attributes){
        theGreatandSpaceousBuilding.attributes = attributes;
    }

    public static Location getLocation() {
        return location; 
    }
     
    public static void setLocation(Location location){
        theGreatandSpaceousBuilding.location = location;
    }
        
    public static void main(String[] args) {
        
        try {
            
            //open character steam files for end user input and output
            theGreatandSpaceousBuilding.inFile = new BufferedReader (new InputStreamReader(System.in));
            theGreatandSpaceousBuilding.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            theGreatandSpaceousBuilding.logFile = new PrintWriter(filePath);

            //create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView("");
            startProgramView.startProgram();
            return;
        }
        catch (Throwable e){
            System.out.println("Exception:" + e.toString() +
                               "\nCause:" + e.getCause() +
                               "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        }
        
        finally {
            try {
               if (theGreatandSpaceousBuilding.inFile != null)
                   theGreatandSpaceousBuilding.inFile.close();
               
               if (theGreatandSpaceousBuilding.outFile !=null)
                   theGreatandSpaceousBuilding.outFile.close();
               
               if (theGreatandSpaceousBuilding.logFile != null)
                   theGreatandSpaceousBuilding.logFile.close();   
            } 
            catch (IOException ex) {
                System.out.println("Error closing file");
                return;
            }
        }
    }
}
