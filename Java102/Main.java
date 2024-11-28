
public class Main {
        public interface Shape {
        public double area();
    
        public double perimeter();
    
        /** 
        * @return Whether point p is inside of the shape.
        */
        public boolean isInside(Point p);
        /** 
        * @return Whether point p part of/on the border of the shape.
        */
        public boolean isOn(Point p);
    
        /** 
        * @param x How much to translate the shape by in the + x direction.
        * @param y How much to translate the shape by in the + y direction.
        * @return The shape that results from the translation.
        */
        public Shape translate(double x, double y);
    
        /** 
        * @return The shape that results from scaling by k.
        */
        public Shape scale(double k);
    }

    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }
    public static void main(String[] args) {
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
    }
}

