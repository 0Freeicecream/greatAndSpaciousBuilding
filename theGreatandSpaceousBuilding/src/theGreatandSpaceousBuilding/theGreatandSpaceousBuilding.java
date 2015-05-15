/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGreatandSpaceousBuilding;

import byui.cit260.theGreatandSpaceousBuilding.model.Game;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Location;
import byui.cit260.theGreatandSpaceousBuilding.model.Map;

/**
 *
 * @author Ted 
*/
public class theGreatandSpaceousBuilding {
    
        
    public static void main(String[] args) {
        
        //Game Test
        Game gameOne = new Game();
        gameOne.setTotalTime(0.0);
        gameOne.setPlayerCoordinatesX(1);
        gameOne.setPlayerCoordinatesY(5);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Player Test
        Player playerOne = new Player();    
        
        playerOne.setName("Fred Fredburger");
        playerOne.setBestTime(999999999.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Map Test
        Map mapOne = new Map();
        
        mapOne.setRowCount(5);
        mapOne.setCollumnCount(5);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
    
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
