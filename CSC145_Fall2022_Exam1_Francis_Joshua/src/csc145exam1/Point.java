package csc145exam1;

// Point Object 
public class Point {

    // Variables 
    int x;
    int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString Method to Print
    public String toString() {
        String result = "(" + x + "," + y + ")";
        return result;
    }

}
