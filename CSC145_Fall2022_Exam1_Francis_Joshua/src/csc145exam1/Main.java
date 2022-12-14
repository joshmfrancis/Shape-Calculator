package csc145exam1;

//Driver Class For The Project 
public class Main {

    public static void main(String[] args) {

        // Creates 4 Objects: Triangle, Circle, Parallelogram, and Octagon and gives them parameters to run 
        Triangle_Francis_Joshua triangle = new Triangle_Francis_Joshua(2.2f, 3.7f, new Point(100, 100));
        Circle_Francis_Joshua circle = new Circle_Francis_Joshua(5.2f, new Point(200, 50));
        Parallelogram_Francis_Joshua parallelogram = new Parallelogram_Francis_Joshua(4.5f, 6.9f, new Point(75, 65));
        Octagon_Francis_Joshua octagon = new Octagon_Francis_Joshua(3.1f, new Point(34, 27));

        // Printing the objects using the toString Method
        System.out.println("***** Joshua Francis: CSC Software Development");

        // Calls toString() from each "shape" class 
        // Uses Decimal Formatter on getters for each shape
        // Output for Triangle 
        System.out.println();
        System.out.println(triangle);

        // Output for Circle 
        System.out.println();
        System.out.println(circle);

        // Output for Parallelogram 
        System.out.println();
        System.out.println(parallelogram);

        // Output for Octagon 
        System.out.println();
        System.out.println(octagon);
    }

}
