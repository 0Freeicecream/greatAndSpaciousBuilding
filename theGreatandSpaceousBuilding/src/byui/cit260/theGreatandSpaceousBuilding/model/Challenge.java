package byui.cit260.theGreatandSpaceousBuilding.model;

import java.util.Objects;

public class Challenge {

        /**
     * @author Nena
     * 
     */
    
    //class attributes
    private String type;
    private double challengeRating;
    
    public Challenge(){
    }

    @Override
    public String toString() {
        return "Challenge{" + "type=" + type + ", challengeRating=" + challengeRating + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.challengeRating) ^ (Double.doubleToLongBits(this.challengeRating) >>> 32));
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
        final Challenge other = (Challenge) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.challengeRating) != Double.doubleToLongBits(other.challengeRating)) {
            return false;
        }
        return true;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public double getChallengeRating() {
        return challengeRating;
    }

    public void setChallengeRating(double challengeRating) {
        this.challengeRating = challengeRating;
    }
    
}
