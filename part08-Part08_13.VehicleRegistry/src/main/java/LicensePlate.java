
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public int hashCode(){
        return this.liNumber.hashCode() + this.country.hashCode();
    }
    
    @Override
    public boolean equals(Object object){
        if(this == object){ //if variables are located in the same place=>same
            return true;
        }
        if(!(object instanceof LicensePlate)){ //if object is not a type of licensePlate=>not same
            return false;
        }
        
        LicensePlate licensePlate = (LicensePlate) object; //convert object to a licensePlate object
        
        //if instance variables of the objects are the same, => same objects
        if (this.liNumber.equals(licensePlate.liNumber) &&
            this.country.equals(licensePlate.country)) {
            return true;
        }
        return false;
    }

}
