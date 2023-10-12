public class Point2D {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5); a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY());
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY());
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY());
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); // Question: Why don’t you need c.toString() here?
//  System.out.println("Are b and c equal:" + b.equals(c));
    }
}
