/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGreatandSpaceousBuilding;

import byui.cit260.theGreatandSpaceousBuilding.model.Player;

/**
 *
 * @author Ted 
*/
public class theGreatandSpaceousBuilding {
    
        
    public static void main(String[] args) {
        Player playerOne = new Player();    
        
        playerOne.setName("Fred Fredburger");
        playerOne.setBestTime(999999999.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
}
