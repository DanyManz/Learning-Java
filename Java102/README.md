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
Test code for "Practice: maxSideLength"
```java
Grid<Integer> grid1 = new Grid<Integer>(5, null);
        Grid<Integer> grid2 = new Grid<Integer>(30, null);
        Grid<Integer> grid3 = new Grid<Integer>(10, null);
        System.out.println("Max Side Length: " + Grid.maxSideLength());
```
Test code for "Practice: fromPoints" (I don't really like how I did with this problem)
```java
      Point p1 = new Point(10, 0);
      Point p2 = new Point(0, 5);
      Point p3 = new Point(0, 15);
        Circle circle = Circle.fromPoints(p1, p2, p3);
        System.out.println("New circle center point: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("New circle radius: " + circle.getRadius());

```
Test code for "Practice: Right Triangle" (This is to test every single thing in the RightTriangle class)
```java
Point inTest = new Point(5, 3);
        Point onTest = new Point(3, 0);
        Point corner = new Point(0, 0);
        RightTriangle T1 = new RightTriangle(corner, 3, 4);
        System.out.println("Area: " + T1.area());
        System.out.println("Perimeter: " + T1.perimeter());
        System.out.println("it is " + T1.isInside(inTest) + " that point 'inTest' is inside of T1");
        System.out.println("it is " + T1.isOn(onTest) + " that point 'onTest' is on the perimeter of T1");
        RightTriangle TranslatedT1 = T1.translate(7, 13);
        System.out.println("if you translate T1 by (7,13), the coordinates of its corner will be: (" + TranslatedT1.corner.x + ", " + TranslatedT1.corner.y + ")");
        RightTriangle ScaledT1 = T1.scale(2);
        System.out.println("if you scale T1 up by 2 times, the first side length will be " + ScaledT1.sideLength1 + ", and its second side length will be " + ScaledT1.sideLength2);
        RightTriangle T2 = new RightTriangle(corner, 6, 8);
        System.out.println("it is " + RightTriangle.similar(T1, T2) + " that T1 is similar to T2");
        RightTriangle T3 = new RightTriangle(corner, 10, 15);
        System.out.println("it is " + RightTriangle.similar(T2, T3) + " that T2 is similar to T3");
```
Test code for "Practice: returnAll"
```java
 LibraryItem[] items = new LibraryItem[4];
        Book book1 = new Book("Book 1", "1", "Book Writer", 200);
        items[0] = book1;
        book1.isCheckedOut = true;
        Book book2 = new Book("Book 2", "2", "Book Writer", 400);
        items[1] = book2;
        book2.isCheckedOut = true;
        DVD DVD1 = new DVD("Movie 1", "3", 90);
        items[2] = DVD1;
        DVD1.isCheckedOut = false;
        DVD DVD2 = new DVD("Movie 2", "4", 180);
        items[3] = DVD2;
        DVD2.isCheckedOut = true;
        returnAll(items);

        System.out.println("it is " + book1.isCheckedOut + " that Book 1 is checked out");
        System.out.println("it is " + book2.isCheckedOut + " that Book 2 is checked out");
        System.out.println("it is " + DVD1.isCheckedOut + " that Movie 1 is checked out");
        System.out.println("it is " + DVD2.isCheckedOut + " that Movie 2 is checked out");
```
