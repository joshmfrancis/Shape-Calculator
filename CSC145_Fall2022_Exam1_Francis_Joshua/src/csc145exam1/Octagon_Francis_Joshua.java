package csc145exam1;

// Decimal Formatter for Output
import java.text.DecimalFormat;

//Octagon
public class Octagon_Francis_Joshua implements Calculable {

    // Creates a Decimal Formatter for use in the output 
    DecimalFormat decimal = new DecimalFormat("#.00");

    //Variables 
    float side;
    float area;
    float perimeter;
    Point location;

    // Default Constuctor // Not used in this form 
    public Octagon_Francis_Joshua() {
        side = 0;
        location = null;
    }

    // Overloaded Constructor
    public Octagon_Francis_Joshua(float side, Point location) {
        this.side = side;
        this.location = location;
    }

    // Methods
    // Getters 
    public float getSide() {
        return side;
    }

    public float getArea() {
        this.area = (float) (2 * (1 + Math.sqrt(2)) * (Math.pow(side, 2))); // Area = 2(1 + sqrt(2)) * Side Length^2
        return area;
    }

    public float getPerimiter() {
        this.perimeter = (8 * side); // Perimiter = (8 * Side Length)
        return perimeter;
    }

    public Point getLocation() {
        return location;
    }

    // toString!    
    public String toString() {
        String result = "*** Octagon \nSide Length: " + decimal.format(side)
                + "\nArea: " + decimal.format(getArea()) + "\nPerimiter: "
                + decimal.format(getPerimiter()) + "\nLocation "
                + getLocation();
        return result;
    }
}
