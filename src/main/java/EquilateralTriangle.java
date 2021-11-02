import java.util.Scanner;

// TODO FOR HOMEWORK: Write the entire Equilateral Triangle Class
//    NOTE: We will be expecting a correct Triangle class even though we aren't spelling out what to do.
//          Use all the information within the project and your knowledge base.
//          Feel free to get fancy and explore here, as long as you have the basics we won't discount anything extra
//          you might get wrong.
//    NOTE: An EquilateralTriangle has the same base for all 3 sides, and the height is always (sqrt(3)/2) * the base.
//          So the important thing to note is you will only need the base and you can calculate the height
public class EquilateralTriangle {
    /**
     * Base of the Equilateral triangle
     */
    private double base;

    /**
     * Creates an instance of the Triangle class
     * NOTE: Do not touch this method!
     */
    public EquilateralTriangle() {
    }

    /**
     * Get the Base of the Triangle.
     * @return Base of the Triangle
     */
    public double getBase() {
        return this.base;
    }

    /**
     * Set the Base of the Triangle
     * @param base Base of the Triangle to set
     */
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    /**
     * Calculate the Height of the Triangle.
     * @return the Height of the Triangle
     */
    public double height() {
        return (Math.sqrt(3) / 2) * base;
    }

    /**
     * Calculate the perimeter of the triangle.
     * @return the perimeter of the triangle.
     */
    public double perimeter() {
        return this.base * 3;
    }

    /**
     * Calculate the area of the triangle.
     * @return Area of the triangle
     */
    public double area() {
        return (base * height()) / 2;
    }

    /**
     * The main method for the Equilateral Triangle class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        EquilateralTriangle et = new EquilateralTriangle();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter base length (must be > 0): ");
        String length = myObj.nextLine();

        double baseLength = Double.parseDouble(length);
        et.setBase(baseLength);

        double height = et.height();
        double area = et.area();
        double perimeter = et.perimeter();

        System.out.println("An equilateral triangle with base length of " + et.getBase() + " has a height of: " + height);
        System.out.println("An equilateral triangle with base length of " + et.getBase() + " has an area of: " + area);
        System.out.println("An equilateral triangle with base length of " + et.getBase() + " has a perimeter of: " + perimeter);
    }
}