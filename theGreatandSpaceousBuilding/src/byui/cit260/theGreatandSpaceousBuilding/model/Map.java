package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;

public class Map implements Serializable {

     /**
     * @author Ted
     * 
     */
    
    // class instance variables
    private double rowCount;
    private double collumnCount;

    public Map() {
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getCollumnCount() {
        return collumnCount;
    }

    public void setCollumnCount(double collumnCount) {
        this.collumnCount = collumnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", collumnCount=" + collumnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.collumnCount) ^ (Double.doubleToLongBits(this.collumnCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.collumnCount) != Double.doubleToLongBits(other.collumnCount)) {
            return false;
        }
        return true;
    }
    
    
}
