package csc145exam1;

// Decimal Formatter for Output
import java.text.DecimalFormat;

// Circle 
public class Circle_Francis_Joshua implements Calculable {

    // Creates a Decimal Formatter for use in the output 
    DecimalFormat decimal = new DecimalFormat("#.00");

    // Variables
    float radius;
    float area;
    float perimeter;
    Point location;

    // Default Constructor // Not used in this form 
    public Circle_Francis_Joshua() {
        radius = 0;
        location = null;
    }

    // Overloaded Constructor
    public Circle_Francis_Joshua(float radius, Point location) {
        this.radius = radius;
        this.location = location;
    }

    // Methods 
    // Getters
    public float getRadius() {
        return radius;
    }

    public float getArea() {
        this.area = (float) (Math.PI * Math.pow(radius, 2)); // Area = (PI * Raduis^2)
        return area;
    }

    public float getPerimiter() {
        this.perimeter = (float) (2 * Math.PI * radius); // Perimiter = (2 * PI * Radius)
        return perimeter;
    }

    public Point getLocation() {
        return location;
    }

    // toString Method to Print
    public String toString() {
        String result = "*** Circle \nRadius: " + decimal.format(radius)
                + "\nArea: " + decimal.format(getArea()) + "\nPerimiter: "
                + decimal.format(getPerimiter()) + "\nLocation "
                + getLocation();
        return result;
    }

}
