package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;

public class Location implements Serializable {

        /**
     * @author Ted
     * 
     */
    
    // class variables
        private double x;
        private double y;
        private double fruitPoints;
        private boolean ironRod;
        private boolean path;
        private boolean holyGhost;
        
        public Location() {
        }
        
        // functions to pull internal variables
        public double getX() {
            return x;
        }
        
        public double getY() {
            return y;
        }
        
        public double getFruitPoints() {
            return fruitPoints;
        }
        
        public boolean hasIronRod() {
            return ironRod;
        }
        
        public boolean hasPath() {
            return path;
        }
        
        public boolean hasHolyGhost() {
            return holyGhost;
        }
        
        // Set variables
        public void setX(double x) {
            this.x = x;
        }
        
        public void setY(double y) {
            this.y = y;
        }
        
        public void setFruitPoints(double fruitPoints) {
            this.fruitPoints = fruitPoints;
        }
        
        public void setIronRod(boolean ironRod) {
            this.ironRod = ironRod;
        }
        
        public void setPath(boolean path) {
            this.path = path;
        }
        
        public void setHolyGhost(boolean holyGhost) {
            this.holyGhost = holyGhost;
        }

    @Override
    public String toString() {
        return "Location{" + "x=" + x + ", y=" + y + ", fruitPoints=" + fruitPoints + ", ironRod=" + ironRod + ", path=" + path + ", holyGhost=" + holyGhost + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.fruitPoints) ^ (Double.doubleToLongBits(this.fruitPoints) >>> 32));
        hash = 43 * hash + (this.ironRod ? 1 : 0);
        hash = 43 * hash + (this.path ? 1 : 0);
        hash = 43 * hash + (this.holyGhost ? 1 : 0);
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fruitPoints) != Double.doubleToLongBits(other.fruitPoints)) {
            return false;
        }
        if (this.ironRod != other.ironRod) {
            return false;
        }
        if (this.path != other.path) {
            return false;
        }
        if (this.holyGhost != other.holyGhost) {
            return false;
        }
        return true;
    }
        
        
        
}
