import java.util.ArrayList;

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

    //Practice: returnAll
    public static void returnAll(LibraryItem[] items) {
    for (LibraryItem item: items ) {
        item.returnItem();
    } 
    }
    //Practice: availableItems
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableItems = new ArrayList<>();
        for (LibraryItem item : items ) {
            if (item.isCheckedOut == false) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }
    public static void main(String[] args) {

        }
    }

