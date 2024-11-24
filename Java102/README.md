[Java102 guide](https://github.com/SciBorgs/SciGuides/blob/f069b159a43422559d9ee1573da3498aaebf370f/projects/intro-to-programming/java102)





  Point point = new Point(4, 3);

Point xTranslation = point.translateX(3); // should be (7, 3)
Point yTranslation = point.translateY(-7); // should be (4, -4)
Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)

System.out.println("x transl: (" + xTranslation.x + ", " + xTranslation.y + ")")
System.out.println("y transl: (" + yTranslation.x + ", " + yTranslation.y + ")")
System.out.println("xy transl: (" + xyTranslation.x + ", " + xyTranslation.y + ")")