package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {
	
	//class instance variables
	private String name;
        private double bestTime;
	

	public Player() {
	}

	public String getName() {
		return name;
        }
        
        public double getBestTime() {
                return bestTime;
        }

	public void setName(String name) {
		this.name = name;
	}
        public void setBestTime(double bestTime) {
                this.bestTime = bestTime; //test
        }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        return true;
    }
        
}