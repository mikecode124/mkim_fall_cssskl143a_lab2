public class Square {
    // variables
    private int x;
    private int y;
    private double sideLength;
    private String figure = "[]";

    // methods
    public Square() {}
    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Square(int x, int y, double sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    // Output to the console the character used to represent this shape (this.figure).
    public void draw() {
        System.out.println(figure);
    }

    // Returns the x coordinate of the square.
    int getX() {
        return this.x;
    }

    // Returns the y coordinate of the square.
    int getY() {
        return this.y;
    }

    //Returns the side length of the square.
    double getSideLength() {
        return this.sideLength;
    }

    // Calculates and returns the area of the square.
    double getArea() {
        return (sideLength * sideLength);
    }

    // Mutator methods

    //Set the x coordinate of this square to the specified value.
    public void setX(int x) {
        this.x = x;
    }

    // Sets the y coordinate of this square to the specified value.
    public void setY(int y) {
        this.y = y;
    }

    // Sets the side length of this square to the specified value.
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    // Returns the characters associated with this shape. Sample: "[]"
    @Override
    public String toString() {
        return ("(" + this.x + ", " + this.y + ") " + this.figure);
    }

   // Indicates whether another square is equal to this square.
    public boolean equals(Square that) {
        boolean congruent = false;
        if (
               this.x == that.x &&
               this.y == that.y &&
               this.sideLength == that.sideLength &&
               this.figure.equals(that.figure)
        ) {
            congruent = true;
        }
        return congruent;
    }
}
