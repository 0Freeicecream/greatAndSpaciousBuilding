/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
/**
 *
 * @author Néna
 */
public class MapControl {
    
   public static String getLocation() {
       String coordinates = theGreatandSpaceousBuilding.getPlayer().getPosition();
       
       return coordinates;
   }
  
   public static boolean movePlayer(char direction) {
       Player player = theGreatandSpaceousBuilding.getPlayer();
       int x = player.getX();
       int y = player.getY();
       boolean isValid = false;
       
       if ((direction == 'N' && y < 5) ||
            (direction == 'S' && y > 1) ||
            (direction == 'E' && x < 7) ||
            (direction == 'W' && x > 1)) {
           isValid = true;
       }
       
       if (isValid) {
        if (direction == 'N'){
            player.setY(y+1);
        }
        else if (direction == 'S'){
            player.setY(y-1);
        }
        else if (direction == 'E'){
            player.setX(x+1);
        }
        else if (direction == 'W'){
            player.setX(x-1);
        }
        
        // Add coordinates of where we just left to visited
        player.addVisited(x, y);
       }
       
       return isValid;
   };
}
