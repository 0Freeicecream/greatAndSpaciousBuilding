package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;

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
                this.bestTime = bestTime;
        }
}