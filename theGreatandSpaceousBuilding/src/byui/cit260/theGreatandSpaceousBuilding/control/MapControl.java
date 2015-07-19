/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theGreatandSpaceousBuilding.control;

import byui.cit260.theGreatandSpaceousBuilding.exceptions.MapControlException;
import byui.cit260.theGreatandSpaceousBuilding.model.Map;
import byui.cit260.theGreatandSpaceousBuilding.model.Player;
import byui.cit260.theGreatandSpaceousBuilding.model.Game;
import byui.cit260.theGreatandSpaceousBuilding.model.Location;
import byui.cit260.theGreatandSpaceousBuilding.model.Scene;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
/**
 *
 * @author Néna
 */
public class MapControl {
    
   public static String getCoordinates() {
       String coordinates = theGreatandSpaceousBuilding.getPlayer().getPosition();
       
       return coordinates;
   }
  
   public static void movePlayer(char direction) throws MapControlException {
        
       Player player = theGreatandSpaceousBuilding.getPlayer();
       Game game = theGreatandSpaceousBuilding.getCurrentGame();
       int x = player.getX();
       int y = player.getY();
 
       
       if ((direction == 'N' && y < 5) ||
            (direction == 'S' && y > 1) ||
            (direction == 'E' && x < 7) ||
            (direction == 'W' && x > 1)) {
       }
        else {
            throw new MapControlException("Can not move actor to location "
                                    + x + ", " + y 
                                    + " because that location is outside"
                                    + " the bounds of the map.");
                }
       
       
        if (direction == 'N'){
            player.setY(y+1);
            game.setPlayerCoordinatesY(y+1);
        }
        else if (direction == 'S'){
            player.setY(y-1);
            game.setPlayerCoordinatesY(y-1);
        }
        else if (direction == 'E'){
            player.setX(x+1);
            game.setPlayerCoordinatesX(x+1);
        }
        else if (direction == 'W'){
            player.setX(x-1);
            game.setPlayerCoordinatesX(x-1);
        }
        
        // Add coordinates of where we just left to visited
        player.addVisited(x, y);
   }

    public static Map createMap() {
        //create .map
        Map map = new Map(7, 5);
        
        //create a list of different scenes in the game
        Scene[] scenes = createScenes();
        
        //assigne the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    private static Scene[] createScenes() {
        
        Game game = theGreatandSpaceousBuilding.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setStory(
            "\nYou find yourself in a valley filled with mists of darkness, after being led"
            + "by a man in white flowing robes to a rod of iron, you are instructed to find your"
            + "way to the Tree of Life");
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setStory(
                "\nYou have made it to the Tree of Life!"
                + "         you get respect");
        scenes[SceneType.finish.ordinal()] = finishScene;
        
                Scene quizOneScene = new Scene();
        quizOneScene.setQuestion(
            "Who translated the Book of Mormon"
            + "\nA. Jospeh Schmidt"
            + "\nB. Moslet Simerit"
            + "\nC. Henry B. Eyering"
            + "\nD. Joseph Smith");
        quizOneScene.setAnswer('D');
        quizOneScene.getEarnedFruits();
        scenes[SceneType.quizOne.ordinal()] = quizOneScene;

        Scene quizTwoScene = new Scene();
        quizTwoScene.setQuestion(
            "What was the first command that the Lord gave Lehi's children?"
            + "\nA. Go and get the Plates"
            + "\nB. Build a ship"
            + "\nC. Partake of the Tree of Life"
            + "\nD. Joseph Smith");
        quizTwoScene.setAnswer('A');
        quizTwoScene.getEarnedFruits();
        scenes[SceneType.quizTwo.ordinal()] = quizTwoScene;

                Scene quizThreeScene = new Scene();
        quizThreeScene.setQuestion(
            "Who stopped Laman from beating Nephi with a rod"
            + "\nA. Lemuel"
            + "\nB. An angel"
            + "\nC. Samuel"
            + "\nD. Joseph Smith");
        quizThreeScene.setAnswer('B');
        quizThreeScene.getEarnedFruits();
        scenes[SceneType.quizThree.ordinal()] = quizThreeScene;

        Scene quizFourScene = new Scene();
        quizFourScene.setQuestion(
            "Who put the bop in the bop-she-bop-she-bop"
            + "\nA. Jimmie Hendricks?"
            + "\nB. This is not a Book of Mormon Question"
            + "\nC. Huey Lewis?"
            + "\nD. Joseph Smith");
        quizFourScene.setAnswer('B');
        quizFourScene.getEarnedFruits();
        scenes[SceneType.quizFour.ordinal()] = quizFourScene;

        Scene quizFiveScene = new Scene();
        quizFiveScene.setQuestion(
            "Who was the first chief judge of the Nephites?"
            + "\nA. Alma"
            + "\nB. Mosiah"
            + "\nC. Benjamin"
            + "\nD. Joseph Smith");
        quizFiveScene.setAnswer('A');
        quizFiveScene.getEarnedFruits();
        scenes[SceneType.quizFive.ordinal()] = quizFiveScene;

        Scene quizSixScene = new Scene();
        quizSixScene.setQuestion(
            "Who wrote the title page of the Book of Mormon?"
            + "\nA. Mormon"
            + "\nB. Malachi"
            + "\nC. Moroni"
            + "\nD. Joseph Smith");
        quizSixScene.setAnswer('C');
        quizSixScene.getEarnedFruits();
        scenes[SceneType.quizSix.ordinal()] = quizSixScene;

        Scene quizSevenScene = new Scene();
        quizSevenScene.setQuestion(
            "What was the name of the Jaredite survivor that was discovered by the people of Zarahemla?"
            + "\nA. Coriantumr the Third"
            + "\nB. Noah"
            + "\nC. Jacob"
            + "\nD. Joseph Smith");
        quizSevenScene.setAnswer('A');
        quizSevenScene.getEarnedFruits();
        scenes[SceneType.quizSeven.ordinal()] = quizSevenScene;

        Scene quizEightScene = new Scene();
        quizEightScene.setQuestion(
            "What was the name of Mormon's Father?"
            + "\nA. Judah"
            + "\nB. Ishmael"
            + "\nC. Mormon"
            + "\nD. Joseph Smith");
        quizEightScene.setAnswer('C');
        quizEightScene.getEarnedFruits();
        scenes[SceneType.quizEight.ordinal()] = quizEightScene;

        Scene quizNineScene = new Scene();
        quizNineScene.setQuestion(
            "Who was Mulek's Father"
            + "\nA. Jericho"
            + "\nB. Amalakia"
            + "\nC. Zedikiah"
            + "\nD. Joseph Smith");
        quizNineScene.setAnswer('C');
        quizNineScene.getEarnedFruits();
        scenes[SceneType.quizNine.ordinal()] = quizNineScene;

        Scene quizTenScene = new Scene();
        quizTenScene.setQuestion(
            "Who led an army of 1000 stripling warriors?"
            + "\nA. Gidgidonni"
            + "\nB. Helaman"
            + "\nC. Mormon"
            + "\nD. Joseph Smith");
        quizTenScene.setAnswer('B');
        quizTenScene.getEarnedFruits();
        scenes[SceneType.quizTen.ordinal()] = quizTenScene;

        Scene quizElevenScene = new Scene();
        quizElevenScene.setQuestion(
            "Which of these was a son born of Sariah in the wilderness?"
            + "\nA. Lemuel"
            + "\nB. Samuel"
            + "\nC. Joseph"
            + "\nD. Joseph Smith");
        quizElevenScene.setAnswer('C');
        quizElevenScene.getEarnedFruits();
        scenes[SceneType.quizEleven.ordinal()] = quizElevenScene;

        Scene quizTwelveScene = new Scene();
        quizTwelveScene.setQuestion(
            "Which measurement of gold is the most valuable?"
            + "\nA. Limnah"
            + "\nB. Antion"
            + "\nC. Senine"
            + "\nD. Joseph Smith");
        quizTwelveScene.setAnswer('A');
        quizTwelveScene.getEarnedFruits();
        scenes[SceneType.quizTwelve.ordinal()] = quizTwelveScene;

        Scene quizThirteenScene = new Scene();
        quizThirteenScene.setQuestion(
            "What was the name of Nephi's Mother?"
            + "\nA. Alma"
            + "\nB. Sariah"
            + "\nC. Jessica"
            + "\nD. Joseph Smith");
        quizThirteenScene.setAnswer('B');
        quizThirteenScene.getEarnedFruits();
        scenes[SceneType.quizThirteen.ordinal()] = quizThirteenScene;

        Scene quizFourteenScene = new Scene();
        quizFourteenScene.setQuestion(
            "Who was the father of Ammon, Aaron, Omni and Himni?"
            + "\nA. Benjamin"
            + "\nB. Mosiah"
            + "\nC. Jeddikiah"
            + "\nD. Joseph Smith");
        quizFourteenScene.setAnswer('B');
        quizFourteenScene.getEarnedFruits();
        scenes[SceneType.quizFourteen.ordinal()] = quizFourteenScene;

        Scene quizFifteenScene = new Scene();
        quizFifteenScene.setQuestion(
            "What was the final count of the stripling warriors under Helaman's Command?"
            + "\nA. 1001"
            + "\nB. 1"
            + "\nC. 2060"
            + "\nD. Joseph Smith");
        quizFifteenScene.setAnswer('C');
        quizFifteenScene.getEarnedFruits();
        scenes[SceneType.quizFifteen.ordinal()] = quizFifteenScene;

        Scene quizSixteenScene = new Scene();
        quizSixteenScene.setQuestion(
            "Which of these animals was not know to have lived among the Jaredites?"
            + "\nA. Horses"
            + "\nB. Cureloms"
            + "\nC. Quail"
            + "\nD. Joseph Smith");
        quizSixteenScene.setAnswer('C');
        quizSixteenScene.getEarnedFruits();
        scenes[SceneType.quizSixteen.ordinal()] = quizSixteenScene;

        Scene quizSeventeenScene = new Scene();
        quizSeventeenScene.setQuestion(
            "Behold, the Lord slayeth the ______ to bring forth his rightous purposes."
            + "\nA. Evil"
            + "\nB. Wicked"
            + "\nC. Witcher"
            + "\nD. Joseph Smith");
        quizSeventeenScene.setAnswer('B');
        quizSeventeenScene.getEarnedFruits();
        scenes[SceneType.quizSeventeen.ordinal()] = quizSeventeenScene;

        Scene quizEightteenScene = new Scene();
        quizEightteenScene.setQuestion(
            "Which of these was not a Nephite Commander?"
            + "\nA. Moroni"
            + "\nB. Mormon"
            + "\nC. Helaman"
            + "\nD. Joseph Smith");
        quizEightteenScene.setAnswer('D');
        quizEightteenScene.getEarnedFruits();
        scenes[SceneType.quizEightteen.ordinal()] = quizEightteenScene;

        Scene quizNineteenScene = new Scene();
        quizNineteenScene.setQuestion(
            "Which prophet gave us the sacrament prayers?"
            + "\nA. Malakia"
            + "\nB. Moroni"
            + "\nC. Abanidi"
            + "\nD. Joseph Smith");
        quizNineteenScene.setAnswer('B');
        quizNineteenScene.getEarnedFruits();
        scenes[SceneType.quizNineteen.ordinal()] = quizNineteenScene;

        Scene quizTwentyScene = new Scene();
        quizTwentyScene.setQuestion(
            "Who have no need of repentance according to Moroni?"
            + "\nA. Little Children"
            + "\nB. Perfect People"
            + "\nC. Prophets and Apostles"
            + "\nD. Joseph Smith");
        quizTwentyScene.setAnswer('A');
        quizTwentyScene.getEarnedFruits();
        scenes[SceneType.quizTwenty.ordinal()] = quizTwentyScene;

        Scene quizTwentyoneScene = new Scene();
        quizTwentyoneScene.setQuestion(
            "When did the Nephites and Lamanites separate?"
            + "\nA. After the Death of Lehi"
            + "\nB. When the first child of Laman was born"
            + "\nC. Once Zarahemla was established"
            + "\nD. Joseph Smith");
        quizTwentyoneScene.setAnswer('B');
        quizTwentyoneScene.getEarnedFruits();
        scenes[SceneType.quizTwentyone.ordinal()] = quizTwentyoneScene;

        Scene quizTwentytwoScene = new Scene();
        quizTwentytwoScene.setQuestion(
            "What does deseret mean?"
            + "\nA. Desert"
            + "\nB. Honey Bee"
            + "\nC. Dessert"
            + "\nD. Joseph Smith");
        quizTwentytwoScene.setAnswer('B');
        quizTwentytwoScene.getEarnedFruits();
        scenes[SceneType.quizTwentytwo.ordinal()] = quizTwentytwoScene;

        Scene quizTwentythreeScene = new Scene();
        quizTwentythreeScene.setQuestion(
            "Who told Nehpi to slay Laban?"
            + "\nA. Laman"
            + "\nB. Satan"
            + "\nC. An Angel"
            + "\nD. Joseph Smith");
        quizTwentythreeScene.setAnswer('C');
        quizTwentythreeScene.getEarnedFruits();
        scenes[SceneType.quizTwentythree.ordinal()] = quizTwentythreeScene;

        Scene quizTwentyfourScene = new Scene();
        quizTwentyfourScene.setQuestion(
            "Who was the last Jaradite Prophet"
            + "\nA. Mohonri Moriancumer"
            + "\nB. Jared"
            + "\nC. Ether"
            + "\nD. Joseph Smith");
        quizTwentyfourScene.setAnswer('C');
        quizTwentyfourScene.getEarnedFruits();
        scenes[SceneType.quizTwentyfour.ordinal()] = quizTwentyfourScene;

        Scene quizTwentyfiveScene = new Scene();
        quizTwentyfiveScene.setQuestion(
            "How long was Nephi bound with rope during the journey to the promised land?"
            + "\nA. 4 weeks"
            + "\nB. 4 hours"
            + "\nC. 4 days"
            + "\nD. 4 minutes");
        quizTwentyfiveScene.setAnswer('C');
        quizTwentyfiveScene.getEarnedFruits();
        scenes[SceneType.quizTwentyfive.ordinal()] = quizTwentyfiveScene;

        Scene quizTwentysixScene = new Scene();
        quizTwentysixScene.setQuestion(
            "What verses are sometimes referred to as the 'promise' of the Book of Morman?"
            + "\nA. Moroni 10:3-5"
            + "\nB. Helaman 10:4"
            + "\nC. Mosiah 4:2"
            + "\nD. Joseph Smith History 1:2");
        quizTwentysixScene.setAnswer('A');
        quizTwentysixScene.getEarnedFruits();
        scenes[SceneType.quizTwentysix.ordinal()] = quizTwentysixScene;

        Scene quizTwentysevenScene = new Scene();
        quizTwentysevenScene.setQuestion(
            "What river in the Book of Mromon had its headwaters near the city of Manti"
            + "\nA. Jared"
            + "\nB. Sidon"
            + "\nC. Jerusalem"
            + "\nD. Joseph Smith");
        quizTwentysevenScene.setAnswer('B');
        quizTwentysevenScene.getEarnedFruits();
        scenes[SceneType.quizTwentyseven.ordinal()] = quizTwentysevenScene;

        Scene quizTwentyeightScene = new Scene();
        quizTwentyeightScene.setQuestion(
            "Who did Nephi give the plates to?"
            + "\nA. Jacob"
            + "\nB. His eldest son"
            + "\nC. The Lord"
            + "\nD. Joseph Smith");
        quizTwentyeightScene.setAnswer('A');
        quizTwentyeightScene.getEarnedFruits();
        scenes[SceneType.quizTwentyeight.ordinal()] = quizTwentyeightScene;

        Scene quizTwentynineScene = new Scene();
        quizTwentynineScene.setQuestion(
            "What group of people prayed atop the Rameumptom"
            + "\nA. The Rameumnites"
            + "\nB. The Lamanites"
            + "\nC. The Zoramites"
            + "\nD. The Nephites");
        quizTwentynineScene.setAnswer('C');
        quizTwentynineScene.getEarnedFruits();
        scenes[SceneType.quizTwentynine.ordinal()] = quizTwentynineScene;

        Scene quizThirtyScene = new Scene();
        quizThirtyScene.setQuestion(
            "Which of these is a primary song?"
            + "\nA. All Creatures of Our God and King"
            + "\nB. Take My Life"
            + "\nC. I Know That My Savior Loves Me"
            + "\nD. Something To Be");
        quizThirtyScene.setAnswer('C');
        quizThirtyScene.getEarnedFruits();
        scenes[SceneType.quizThirty.ordinal()] = quizThirtyScene;

        Scene quizThirtyoneScene = new Scene();
        quizThirtyoneScene.setQuestion(
            "Who wrote the epistle that vehemently taught not to baptize little children?"
            + "\nA. Moroni"
            + "\nB. Samuel the Lamanite"
            + "\nC. Mormon"
            + "\nD. Joseph Smith");
        quizThirtyoneScene.setAnswer('C');
        quizThirtyoneScene.getEarnedFruits();
        scenes[SceneType.quizThirtyone.ordinal()] = quizThirtyoneScene;

        Scene quizThirtytwoScene = new Scene();
        quizThirtytwoScene.setQuestion(
            "What book is this game's questions based on?"
            + "\nA. The Book of Mormon"
            + "\nB. The New Testamant"
            + "\nC. The Doctrine and Covenants"
            + "\nD. Doesn't the question that asks who made the book technically mean that it's not one book?");
        quizThirtytwoScene.setAnswer('A');
        quizThirtytwoScene.getEarnedFruits();
        scenes[SceneType.quizThirtytwo.ordinal()] = quizThirtytwoScene;

        Scene quizThirtythreeScene = new Scene();
        quizThirtythreeScene.setQuestion(
            "What kind of path was the one that lead to the Tree of Life?"
            + "\nA. Strait and Narrow"
            + "\nB. Less Traveled"
            + "\nC. The Path Choice Above All Others"
            + "\nD. Light and Easy");
        quizThirtythreeScene.setAnswer('B');
        quizThirtythreeScene.getEarnedFruits();
        scenes[SceneType.quizThirtythree.ordinal()] = quizThirtythreeScene;
        
        return scenes;
        
        
    }    
    public enum SceneType {
        start,
        quizShow,
        quizOne,
        quizTwo,
        quizThree,
        quizFour,
        quizFive,
        quizSix,
        quizSeven,
        quizEight,
        quizNine,
        quizTen,
        quizEleven,
        quizTwelve,
        quizThirteen,
        quizFourteen,
        quizFifteen,
        quizSixteen,
        quizSeventeen,
        quizEightteen,
        quizNineteen,
        quizTwenty,
        quizTwentyone,
        quizTwentytwo,
        quizTwentythree,
        quizTwentyfour,
        quizTwentyfive,
        quizTwentysix,
        quizTwentyseven,
        quizTwentyeight,
        quizTwentynine,
        quizThirty,
        quizThirtyone,
        quizThirtytwo,
        quizThirtythree,
        finish;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.quizOne.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.quizTwo.ordinal()]);
        
        // Start Point
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        
        locations[0][3].setScene(scenes[SceneType.quizThree.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.quizFour.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.quizFive.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.quizSix.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.quizSeven.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.quizEight.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.quizNine.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.quizTen.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.quizEleven.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.quizTwelve.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.quizThirteen.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.quizFourteen.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.quizFifteen.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.quizSixteen.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.quizSeventeen.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.quizEightteen.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.quizNineteen.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.quizTwenty.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.quizTwentyone.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.quizTwentytwo.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.quizTwentythree.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.quizTwentyfour.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.quizTwentyfive.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.quizTwentysix.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.quizTwentyseven.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.quizTwentyeight.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.quizTwentynine.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.quizThirty.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.quizThirtyone.ordinal()]);

        // end point
        locations[6][2].setScene(scenes[SceneType.finish.ordinal()]);
        
        locations[6][3].setScene(scenes[SceneType.quizThirtytwo.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.quizThirtythree.ordinal()]);
    }
    
    public void getScene() {
        String point = getCoordinates();
        
    }
}
