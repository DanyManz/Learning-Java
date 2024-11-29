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
        LibraryItem[] items = new LibraryItem[4];
        Book book1 = new Book("Book 1", "1", "Book Writer", 200);
        items[0] = book1;
        book1.isCheckedOut = false;
        Book book2 = new Book("Book 2", "2", "Book Writer", 400);
        items[1] = book2;
        book2.isCheckedOut = false;
        DVD DVD1 = new DVD("Movie 1", "3", 90);
        items[2] = DVD1;
        DVD1.isCheckedOut = true;
        DVD DVD2 = new DVD("Movie 2", "4", 180);
        items[3] = DVD2;
        DVD2.isCheckedOut = false;

        ArrayList<LibraryItem> availableItems = availableItems(items);
     
        System.out.println("the available items are: " + availableItems.toString());
        }
    }

