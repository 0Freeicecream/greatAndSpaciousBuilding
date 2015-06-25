package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Player implements Serializable {
	
    /**
     * @author Nena/Ted
     */
    
	//class instance variables
	private String name;
        private double bestTime;
        private int x;
        private int y;
        
        ArrayList<String> visited = new ArrayList<String>();

        

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
        
        public int getX() {
             return x;
         }

        public void setX(int x) {
             this.x = x;
         }

        public int getY() {
             return y;
        }

        public void setY(int y) {
             this.y = y;
        }
        
        public void addVisited(int x, int y) {
            String coords = x + "," + y;
            
            if (!visited.contains(coords)) {
                visited.add(coords);
            }
        }
        
        public boolean hasVisited(int x, int y) {
            String coords = x + "," + y;
            return visited.contains(coords);
        }
        
        public String getPosition() {
            return x + "," + y;
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