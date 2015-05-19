package byui.cit260.theGreatandSpaceousBuilding.model;

import java.util.Objects;

public class Scenario {

        /**
     * @author Nena
     * 
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
        return "Scenario{" + "story=" + story + ", question=" + question + ", choices=" + choices + ", answer=" + answer + ", earnedFruits=" + earnedFruits +  '}';
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
