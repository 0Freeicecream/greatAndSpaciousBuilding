package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;

public class Game implements Serializable {
    
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

    public Game() {
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
        System.out.println("Your setMap funciton is working sorta okay I guess");
    }

    public void setPlayer(Player player) {
        System.out.println("Your setPlayer function is working properly");
    }
    
}
