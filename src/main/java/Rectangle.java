import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [X] Update both the set method for rectangle like you did for square
 *      [X] Write the setters for the Rectangle Class
 *      [X] Write methods for the Rectangle Class
 */
public class Rectangle {
    /**
     * The length of the rectangle
     */
    private double length;

    /**
     * The width of the rectangle
     */
    private double width;

    /**
     * Creates an instance of the Rectangle class
     */
    public Rectangle() {
    }

    /**
     * Gets the length of the rectangle
     * @return The length
     */
    public double getLength() {
        return length;
    }

    // TODO FOR HOMEWORK: Write the setLength method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero

    /**
     * Set the length of the rectangle.
     * @param length Length of the rectangle to set. Must be greater than 0.
     */
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    // TODO FOR HOMEWORK: Write the setWidth method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero

    /**
     * Set the Width of the rectangle
     * @param width Width of the rectangle to set. Must be greater than 0.
     */
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }
    // TODO FOR HOMEWORK: Write the method for area

    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle
     */
    public double area() {
        return length * width;
    }
    // TODO FOR HOMEWORK: Write the method for perimeter

    /**
     * Calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle
     */
    public double perimeter() {
        return (width * 2) + (length * 2);
    }
    // TODO FOR HOMEWORK: Write a main method

    /**
     * The main method for the Rectangle class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter rectangle length (must be > 0): ");
        String len = myObj.nextLine();

        double length = Double.parseDouble(len);
        rectangle.setLength(length);

        System.out.println("Enter rectangle width (must be > 0): ");
        String wid = myObj.nextLine();

        double width = Double.parseDouble(wid);
        rectangle.setWidth(width);

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();

        System.out.println("A rectangle with length of " + rectangle.getLength() + " and width of " + rectangle.getWidth() + " has an area of: " + area);
        System.out.println("A rectangle with length of " + rectangle.getLength() + " and width of " + rectangle.getWidth() + " has a perimeter of: " + perimeter);
    }
}