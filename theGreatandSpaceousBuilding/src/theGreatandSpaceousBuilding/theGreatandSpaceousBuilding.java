/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGreatandSpaceousBuilding;

import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Location;

/**
 *
 * @author Ted 
*/
public class theGreatandSpaceousBuilding {
    
        
    public static void main(String[] args) {
        //Player Test
        Player playerOne = new Player();    
        
        playerOne.setName("Fred Fredburger");
        playerOne.setBestTime(999999999.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
        //Location Test
        Location locationOne = new Location();    
        
        locationOne.setX(0);
        locationOne.setY(-1);
        locationOne.setFruitPoints(2);
        locationOne.setIronRod(true);
        locationOne.setPath(true);
        locationOne.setHolyGhost(false);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
    }
}
