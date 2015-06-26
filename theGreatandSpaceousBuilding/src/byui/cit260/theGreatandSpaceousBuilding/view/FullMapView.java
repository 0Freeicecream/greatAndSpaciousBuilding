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

/**
 *
 * @author Ted
 */
public class FullMapView {
    public void displayFullMap() {
        
        int rowCount = 5;
        int columnCount = 7;
        String rowDivider = "----------------";
        
        Player player = theGreatandSpaceousBuilding.getPlayer();
        
        //displayMap(locations): void {

        //get the map locations from the current game
        //this.mapGetLocation();
        
        //DISPLAY title
        System.out.println("\n*********************THE MAP*********************");
        
        //DISPLAY row of column numbers
        System.out.println("  1 2 3 4 5 6 7");
        
        //FOR every row in map
        for (int i = 0; i < rowCount ; i++){
            System.out.println(rowDivider);
            System.out.print(i + 1);
            for (int j = 0; j < columnCount; j++) {
                System.out.print("|");
                if (player.hasVisited(j, i)) {
                    System.out.print("~");
                }
                else {
                    System.out.print("?");
                }
            }
            System.out.println("|");
        }
        System.out.println(rowDivider);
        
       System.out.println("\n*************************************************");
    }
        
}