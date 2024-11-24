[Java102 guide](https://github.com/SciBorgs/SciGuides/blob/f069b159a43422559d9ee1573da3498aaebf370f/projects/intro-to-programming/java102)

Test code for "Practice: Center of Mass"
 ```java
    Point[] points ={
        new Point(4,6),
        new Point(5,4),
        new Point(6,5),
        new Point(2,1),
        new Point(3,4)
    };
    Point COM = Point.centerOfMass(points);
    System.out.println("The Center of Mass is:" + COM);
```
Test code for "Practice: Angle"
```java
Point p = new Point(10, -10);
System.out.println("Angle of point P in degrees is " + p.angle());
```
