package csc145exam1;

// Decimal Formatter for Output
import java.text.DecimalFormat;

// Parallelogram 
public class Parallelogram_Francis_Joshua implements Calculable {

    // Creates a Decimal Formatter for use in the output 
    DecimalFormat decimal = new DecimalFormat("#.00");

    //Variables
    float width;
    float height;
    float area;
    float perimeter;
    Point location;

    //Default Constructor // Not used in this form 
    public Parallelogram_Francis_Joshua() {
        width = 0;
        height = 0;
        location = null;
    }

    // Overloaded Constructor
    public Parallelogram_Francis_Joshua(float width, float height, Point location) {
        this.width = width;
        this.height = height;
        this.location = location;
    }

    // Methods
    // Setters // Unused in this form 
    // Getters
    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getArea() {
        this.area = (height * width); // Area = (h * w)
        return area;
    }

    public float getPerimiter() {
        this.perimeter = 2 * (width + height); // Perimiter = (2 * (w + h))
        return perimeter;
    }

    public Point getLocation() {
        return location;
    }

    // toString Method
    public String toString() {
        String result = "*** Parallelogram \nWidth: " + decimal.format(width)
                + "\nHeight: " + decimal.format(height) + "\nArea: "
                + decimal.format(getArea()) + "\nPerimiter: "
                + decimal.format(getPerimiter()) + "\nLocation " + getLocation();
        return result;
    }

}
