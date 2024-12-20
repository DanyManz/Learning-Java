public class Point {
  
  public final double x;
    public final double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point translateX(double t) {
      return new Point(x + t, y);
    }
    
    public Point translateY(double t) {
      return new Point(x, y + t);
    }
    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
    public static double distance(Point p1, Point p2) {
      return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    //Practice: Center of Mass
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static Point centerOfMass(Point[] points) {
      double SumOfX = 0;
      double SumOfY = 0;
        
        for (Point point:points) {
            SumOfX += point.getX();
            SumOfY += point.getY();
        }

      double AvgX = SumOfX / points.length;
      double AvgY = SumOfY / points.length;

      return new Point(AvgX,AvgY);

    }
    //Practice: Angle

      public double angle() {
        double angleinrads = Math.atan2(y, x);
        double angleindegrees = Math.toDegrees(angleinrads);
        return angleindegrees;

      }
}
