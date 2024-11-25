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
Test code for "Practice: Diagonal"
```java
        Grid<Integer> grid = new Grid<>(3,0);
        grid.set(0, 0, 1);
        grid.set(0, 1, 90);
        grid.set(0, 2, 375); 
        grid.set(1, 0, 947);
        grid.set(1, 1, 2);
        grid.set(1, 2, 3964);
        grid.set(2, 0, 430);
        grid.set(2, 1, 1253);
        grid.set(2, 2, 3);
        
        ArrayList<Integer> diagonal = grid.diagonal();
        System.out.println(diagonal);  
```
Test code for "Practice: maxSideLength
```java
Grid<Integer> grid1 = new Grid<Integer>(5, null);
        Grid<Integer> grid2 = new Grid<Integer>(30, null);
        Grid<Integer> grid3 = new Grid<Integer>(10, null);
        System.out.println("Max Side Length: " + Grid.maxSideLength()); ```