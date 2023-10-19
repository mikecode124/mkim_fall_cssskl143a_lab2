public class Point2D {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        a.translate(-1, -1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); // the compiler will automatically find the toString() method when running the
        //print method. @Override keywords helps with this and is considered best practice to do.
        System.out.println("Are b and c equal:" + b.equals(c));
    }


        // why does this work?
        private int x;
        private int y;


        public void setX ( int nX){
            x = nX;
        }

        public void setY ( int nY){
            y = nY;
        }

        public int getX () {
            return x;
        }

        public int getY () {
            return y;
        }

        public void resetToOrigin () {
            x = 0;
            y = 0;
        }

        public void translate ( int dx, int dy){
            x = x + dx;
            y = y + dy;
        }

        @Override // because toString() is a method included with all objects in the base object class, signifying to
        // java that we will be using our own toString() method with each new Point2D object is best practice.
        public String toString() {
            return ("x is " + x + ", y is " + y);
        }
    }