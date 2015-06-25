package byui.cit260.theGreatandSpaceousBuilding.model;

import java.util.Objects;

public class Scenario {

    /**
     * @author Nena
     * 
     * REMEMBER TO CHANGE EVERY INSTANCE OF SCENE TO SCENARIO TO MATCH OUR CODE
     * 
     */

    /*
    private static Scenario[] createScenarios() throws MapControlException {
        BufferedImage image = null;
        
        Game game = CuriousWorkmanship.getCurrentGame();
        
        Scenario[] scenarios = new Scenario[ScenarioType.values().length];
        
        Scenario startingScenario = new Scenario();
        startingScenario.setDescription(
            "\nYou find yourself in a valley filled with mists of darkness, after being led"
            + "by a man in white flowing robes to a rod of iron, you are instructed to find your"
            + "way to the Tree of Life");
        startingScenario.setMapSymbol(" ST ");
        startingScenario.setBlocked(false);
        startingScenario.setTravelTime(240);
        ImageIcon startingScenarioImage = MapControl.getImage(startingScenario,
                "/citbyui/cit260/thegreatandspaciousbuilding/images/startingPoint.jpg");
        startingScenario.setIcon(startingScenarioImage);
        scenarios[ScenarioType.start.ordinal()] = startingScenario;
        
        Scenario finishScenario = new Scenario();
        finishScenario.setDescription(
                "\You have made it to the Tree of Life!"
                + "         you get respect");
        finishScenario.setMapSymbol(" FN ");
        finishScenario.setBlocked(false);
        finishScenario.setTravelTime(Double.POSITIVE_INFINITY);
        ImageIcon finishScenario = MapControl.getImage(finishScenario
                "/citbyui/cit260/curiousworkmanship/image/finish.jpg")
            finishScenario.setIcon(finishScenarioImage);
            scenarios[ScenarioType.finish.ordinal()] = finishScenario;
    }
    
    public enum ScenarioType {
        start,
        quizShow,
        finish;
    }
    
    private static void assignScenariosToLocations(Map map, Scenario[] scenarios) {
        Location[][] locations = map.getLocations();
        
        // Start Point
        locations[0][0].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[0][1].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[0][2].setScenario(scenarios[ScenarioType.start.ordinal()]);
        locations[0][3].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[0][4].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[1][0].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[1][1].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[1][2].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[1][3].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[1][4].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[2][0].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[2][1].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[2][2].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[2][3].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[2][4].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[3][0].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[3][1].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[3][2].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[3][3].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[3][4].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[4][0].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[4][1].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[4][2].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[4][3].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[4][4].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[5][0].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[5][1].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[5][2].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[5][3].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[5][4].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[6][0].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[6][1].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[6][2].setScenario(scenarios[ScenarioType.finish.ordinal()]);
        locations[6][3].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
        locations[6][4].setScenario(scenarios[ScenarioType.quizShow.ordinal()]);
    }
    */
    
    
    //class attributes
    private String story;
    private String question;
    private String choices;
    private String answer;
    private double earnedFruits;
     
    public Scenario(){   
    }
    
    @Override
    public String toString() {
        return "Scenario{" + "story=" + story + ", question=" + question + ", choices=" + choices + ", answer=" + answer + ", earnedFruits=" + earnedFruits + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.story);
        hash = 47 * hash + Objects.hashCode(this.question);
        hash = 47 * hash + Objects.hashCode(this.choices);
        hash = 47 * hash + Objects.hashCode(this.answer);
        hash = 47 * hash + Objects.hashCode(this.earnedFruits);        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scenario other = (Scenario) obj;
        if (!Objects.equals(this.story, other.story)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.choices, other.choices)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.earnedFruits) != Double.doubleToLongBits(other.earnedFruits)) {
            return false;
        }
        return true;
    }
    
    public String getStory(){
        return story;
    }
    
    public String getQuestion(){
        return question;
    }
    
    public String getChoices(){
        return choices;
    }
    
    public String getAnswer(){
        return answer;
    }
    
    public void setStory(String story){
        this.story = story;
    }
    
    public void setQuestion(String question){
        this.question = question;
    }
    
    public void setChoices (String choices){
        this.choices = choices;
    }
    
    public void setAnswer (String answer) {
        this.answer = answer;
    }

    public double getEarnedFruits() {
        return earnedFruits;
    }

    public void setEarnedFruits(double earnedFruits) {
        this.earnedFruits = earnedFruits;
    }
    
}
