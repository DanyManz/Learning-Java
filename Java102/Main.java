public class Main {
 public static void main(String[] args) {
    Point[] points ={
        new Point(4,6),
        new Point(5,4),
        new Point(6,5),
        new Point(2,1),
        new Point(3,4)
    };
    Point COM = Point.centerOfMass(points);
    System.out.println("The Center of Mass is:" + COM);
}
}
