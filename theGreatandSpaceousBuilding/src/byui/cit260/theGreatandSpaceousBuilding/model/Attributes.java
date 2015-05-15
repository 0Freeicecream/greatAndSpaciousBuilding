package byui.cit260.theGreatandSpaceousBuilding.model;

import java.io.Serializable;
import java.util.Objects;

public class Attributes implements Serializable{

        /**
     * @author Nena
     * 
     */
    
    // class variables
    private int fruit;
    private int testimony;
    private int obedience;
    
    public Attributes(){    
    }
    
    @Override
    public String toString() {
        return "Attributes{" + "fruit=" + fruit + ", testimony=" + testimony + ", obedience=" + obedience + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.fruit);
        hash = 79 * hash + Objects.hashCode(this.testimony);
        hash = 79 * hash + Objects.hashCode(this.obedience);
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
        final Attributes other = (Attributes) obj;
        if (!Objects.equals(this.fruit, other.fruit)) {
            return false;
        }
        if (!Objects.equals(this.testimony, other.testimony)) {
            return false;
        }
        if (!Objects.equals(this.obedience, other.obedience)) {
            return false;
        }
        return true;
    }

    public int getFruit(){
        return fruit;
    }
    public int getTestimony() {
        return testimony;
    }
    public int getObedience(){
        return obedience;
    }
    
    public void setFruit(int numFruit){
        this.fruit = numFruit;
    }
    
    public void setTestimony(int numTestimony){
        this.testimony = numTestimony;
    }
    
    public void setObedience(int numObedience) {
        this.obedience = numObedience;
    }
    
}
