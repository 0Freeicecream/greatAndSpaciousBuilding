package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable {

        /**
     * @author Ted
     * 
     */
    
    // class variables
        private int row;
        private int column;
        private int fruitPoints;
        private boolean ironRod;
        private boolean path;
        private boolean holyGhost;
        private Scene scene;
        private boolean visited;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
        
        public Location() {
        }
        
        // functions to pull internal variables
        public int getRow() {
            return row;
        }
        
        public int getColumn() {
            return column;
        }
        
        public int getFruitPoints() {
            return fruitPoints;
        }

        public boolean isVisited() {
        return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
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
        public void setRow(int row) {
            this.row = row;
        }
        
        public void setColumn(int column) {
            this.column = column;
        }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + this.fruitPoints;
        hash = 79 * hash + (this.ironRod ? 1 : 0);
        hash = 79 * hash + (this.path ? 1 : 0);
        hash = 79 * hash + (this.holyGhost ? 1 : 0);
        hash = 79 * hash + Objects.hashCode(this.scene);
        hash = 79 * hash + (this.visited ? 1 : 0);
        return hash;
    }
        
        public void setFruitPoints(int fruitPoints) {
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
        return "Location{" + "row=" + row + ", column=" + column + ", fruitPoints=" + fruitPoints + ", ironRod=" + ironRod + ", path=" + path + ", holyGhost=" + holyGhost +  ", visited=" + visited + '}';
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
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.fruitPoints != other.fruitPoints) {
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
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }
}
