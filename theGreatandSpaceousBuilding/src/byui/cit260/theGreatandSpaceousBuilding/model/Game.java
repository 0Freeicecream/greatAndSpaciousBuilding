package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;
import java.io.BufferedReader;
import java.io.PrintWriter;
import theGreatandSpaceousBuilding.theGreatandSpaceousBuilding;
import byui.cit260.theGreatandSpaceousBuilding.view.View;


public class Game extends View implements Serializable {
    
    /**
     * @author Ted
     * 
     */
    
    //class instance variables
    private double totalTime;
    private double playerCoordinatesX;
    private double playerCoordinatesY;
        
    private Player player;
    private Map map;

    

    public Game(String placeHolder) {
        super(placeHolder);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getPlayerCoordinatesX() {
        return playerCoordinatesX;
    }

    public void setPlayerCoordinatesX(double playerCoordinatesX) {
        this.playerCoordinatesX = playerCoordinatesX;
    }

    public double getPlayerCoordinatesY() {
        return playerCoordinatesY;
    }

    public void setPlayerCoordinatesY(double playerCoordinatesY) {
        this.playerCoordinatesY = playerCoordinatesY;
    }
    
    @Override    
    public boolean doAction(Object o) {
    return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", playerCoordinatesX=" + playerCoordinatesX + ", playerCoordinatesY=" + playerCoordinatesY + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.playerCoordinatesX) ^ (Double.doubleToLongBits(this.playerCoordinatesX) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.playerCoordinatesY) ^ (Double.doubleToLongBits(this.playerCoordinatesY) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerCoordinatesX) != Double.doubleToLongBits(other.playerCoordinatesX)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerCoordinatesY) != Double.doubleToLongBits(other.playerCoordinatesY)) {
            return false;
        }
        return true;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public Map getMap() {
        return this.map;
    }

    public void setPlayer(Player player) {
        this.console.println("Your setPlayer function is working properly");
    }
    
}
