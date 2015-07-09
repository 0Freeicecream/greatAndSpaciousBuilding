/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.view;
import byui.cit260.theGreatandSpaceousBuilding.model.Scene;
;import byui.cit260.theGreatandSpaceousBuilding.model.Map;
import byui.cit260.theGreatandSpaceousBuilding.control.MapControl;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import java.io.BufferedReader;
import java.io.PrintWriter;


/**
 *
 * @author Ted
 */
public class FullMapView extends View {

    public FullMapView(String promptMessage){
        super(promptMessage);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean doAction(Object o) {
        return true;
    }

    public void displayFullMap() {
        
        int rowCount = 5;
        int columnCount = 7;
        String rowDivider = "----------------";
        
        Player player = theGreatandSpaceousBuilding.getPlayer();
        
        //displayMap(locations): void {

        //get the map locations from the current game
        //this.mapGetLocation();
        
        //DISPLAY title
        this.console.println("\n*********************THE MAP*********************");
        
        //DISPLAY row of column numbers
        this.console.println("  1 2 3 4 5 6 7");
        
        //FOR every row in map
        for (int i = 0; i < rowCount ; i++){
            this.console.println(rowDivider);
            this.console.print(i + 1);
            for (int j = 0; j < columnCount; j++) {
                this.console.print("|");
                if (player.hasVisited(j, i)) {
                    this.console.print("~");
                }
                else {
                    this.console.print("?");
                }
            }
            this.console.println("|");
        }
        this.console.println(rowDivider);
        
       this.console.println("\n*************************************************");
    }
        
}