package csc145exam1;

// Decimal Formatter for Output
import java.text.DecimalFormat;

// Right Triangle 
public class Triangle_Francis_Joshua implements Calculable {

    // Creates a Decimal Formatter for use in the output 
    DecimalFormat decimal = new DecimalFormat("#.00");

    // Variables
    float width;
    float height;
    float area;
    float perimeter;
    Point location;

    // Default Constructor // Not used in this form 
    public Triangle_Francis_Joshua() {
        width = 0;
        height = 0;
        location = null;
    }

    // Overloaded Constuctor
    public Triangle_Francis_Joshua(float width, float height, Point location) {
        // Designates
        this.width = width;
        this.height = height;
        this.location = location;
    }

    // Methods
    // Getters 
    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    // Returns Area For Calling In Main Method
    public float getArea() {
        this.area = ((height * width) / 2); // Area = (Height * Width) / 2
        return area;
    }

    // Returns Perimeter For Calling In Main Method
    public float getPerimiter() {
        double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); // A^2 + B^2 = C^2, C^2 Sqrt = Cs
        this.perimeter = (float) (width + height + hypotenuse); // A + B + C = perimeter
        return perimeter;
    }

    // Returns Location For Calling In Main Method
    public Point getLocation() {
        return location;
    }

    // toString Method to Print
    public String toString() {
        String result = "*** Triangle \nWidth: " + decimal.format(width)
                + "\nHeight: " + decimal.format(height) + "\nArea: "
                + decimal.format(getArea()) + "\nPerimiter: "
                + decimal.format(getPerimiter()) + "\nLocation " + getLocation();
        return result;
    }
}
