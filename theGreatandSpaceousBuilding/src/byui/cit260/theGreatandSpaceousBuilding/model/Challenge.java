package byui.cit260.theGreatandSpaceousBuilding.model;

import java.util.Objects;

public class Challenge {

        /**
     * @author Nena
     * 
     */
    
    //class attributes
    private String type;
    private double obedienceMod;

    
    private double testimonyMod;
    
    public Challenge(){
    }
    
    @Override
    public String toString() {
        return "Challenge{" + "type=" + type + ", obedienceMod=" + obedienceMod + ", testimonyMod=" + testimonyMod + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.obedienceMod) ^ (Double.doubleToLongBits(this.obedienceMod) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.testimonyMod) ^ (Double.doubleToLongBits(this.testimonyMod) >>> 32));
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
        if (Double.doubleToLongBits(this.obedienceMod) != Double.doubleToLongBits(other.obedienceMod)) {
            return false;
        }
        return true;
    }
    
    public String getType(){
        return type;
    }
    
    public double getObedienceMod(){
        return obedienceMod;
    }
    
    public double getTestimonyMod(){
        return testimonyMod;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setObedienceMod(double obedienceMod){
        this.obedienceMod = obedienceMod;
    }
    
    public void setTestimonyMod(double testimonyMod){
        this.testimonyMod = testimonyMod;
    }
    
}
