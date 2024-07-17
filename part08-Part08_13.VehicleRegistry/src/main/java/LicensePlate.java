
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

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        LicensePlate changeObj = (LicensePlate) object;

        if (this.country.equals(changeObj.country)
                && this.liNumber.equals(changeObj.liNumber)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        //Multiplying by primenumber ensure eachpart of combined hashcode significantly affects the final value
        //reduces the likelihood of hash collisions
        int primeNumber = 7;
        
        //Initial value of hashcode result
        int result = 1;
        
        //Objects.hashCode generates the hashcode of the given field
        //hashcode is multiplied by primenumber and added to result into hashcode
        result = primeNumber * Objects.hashCode(this.liNumber);
        result = primeNumber * Objects.hashCode(this.country);
        
        //final combined hashcode is returned
        return result;
    }
}
