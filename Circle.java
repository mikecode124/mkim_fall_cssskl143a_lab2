public class Circle {
    // variables
    private int x;
    private int y;
    private double radius;
    private String figure = "O";

    // methods
    public Circle() {}
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Output to the console the character used to represent this shape (this.figure).
    public void draw() {
        System.out.println(figure);
    }

    // Returns the x coordinate of the circle.
    int getX() {
        return this.x;
    }

    // Returns the y coordinate of the circle.
    int getY() {
        return this.y;
    }

    //Returns the side length of the circle.
    double getRadius() {
        return this.radius;
    }

    // Calculates and returns the area of the circle.
    double getArea() {
        return (3.14 * (radius * radius));
    }

    // Mutator methods

    //Set the x coordinate of this circle to the specified value.
    public void setX(int x) {
        this.x = x;
    }

    // Sets the y coordinate of this circle to the specified value.
    public void setY(int y) {
        this.y = y;
    }

    // Sets the side length of this circle to the specified value.
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Returns the characters associated with this shape. Sample: "[]"
    @Override
    public String toString() {
        return ("(" + this.x + ", " + this.y + ") " + this.figure);
    }

    // Indicates whether another circle is equal to this circle.
    public boolean equals(Circle that) {
        boolean congruent = false;
        if (
                this.x == that.x &&
                        this.y == that.y &&
                        this.radius == that.radius &&
                        this.figure.equals(that.figure)
        ) {
            congruent = true;
        }
        return congruent;
    }
}
