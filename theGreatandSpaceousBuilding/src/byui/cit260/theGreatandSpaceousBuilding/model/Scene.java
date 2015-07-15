package byui.cit260.theGreatandSpaceousBuilding.model;

import java.util.Objects;

public class Scene {

    /**
     * @author Nena
     * 
     * REMEMBER TO CHANGE EVERY INSTANCE OF SCENE TO SCENARIO TO MATCH OUR CODE
     * 
     */
    
    //class attributes
    private String story;
    private String question;
    private String answer;
    private int earnedFruits;
    
    private Challenge challenge;
     
    public Scene(){   
    }
    
    @Override
    public String toString() {
        return "Scene{" + "story=" + story + ", question=" + question +", answer=" + answer + ", earnedFruits=" + earnedFruits + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.story);
        hash = 47 * hash + Objects.hashCode(this.question);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.story, other.story)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (this.earnedFruits != other.earnedFruits) {
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
    
    public String getAnswer(){
        return answer;
    }
    
    public void setStory(String story){
        this.story = story;
    }
    
    public void setQuestion(String question){
        this.question = question;
    }
    
    public void setAnswer (String answer) {
        this.answer = answer;
    }

    public int getEarnedFruits() {
        return earnedFruits;
    }

    public void setEarnedFruits(int earnedFruits) {
        this.earnedFruits = earnedFruits;
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

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }
       
}
