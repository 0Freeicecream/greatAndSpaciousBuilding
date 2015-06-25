/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import byui.cit260.theGreatandSpaceousBuilding.model.Map;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Game;
import byui.cit260.theGreatandSpaceousBuilding.model.Location;
import byui.cit260.theGreatandSpaceousBuilding.model.Scene;
import byui.cit260.theGreatandSpaceousBuilding.model.Scene.SceneType;
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

    public static Map createMap() {
        //create .map
        Map map = new Map(5, 7);
        
        //create a list of different scenes in the game
        Scene[] scenes = createScenes();
        
        //assigne the different scenes to locatiosn in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
        private static Scene[] createScenes() {
        
        Game game = theGreatandSpaceousBuilding.getCurrentGame();
        
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setStory(
            "\nYou find yourself in a valley filled with mists of darkness, after being led"
            + "by a man in white flowing robes to a rod of iron, you are instructed to find your"
            + "way to the Tree of Life");
        scenes[Scene.SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setStory(
                "\nYou have made it to the Tree of Life!"
                + "         you get respect");
            scenes[Scene.SceneType.finish.ordinal()] = finishScene;
            return scenes;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        // Start Point
        locations[0][0].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.finish.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.quizShow.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.quizShow.ordinal()]);
    }


}
