public class RightTriangle implements Main.Shape{
    public double sideLength1;
    public double sideLength2;
    public Point corner;

    public RightTriangle(Point corner, double sideLength1, double sideLength2) {
        this.corner = corner;
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public double area() {
        return (sideLength1 * sideLength2) / 2;
    }

    public double perimeter() {
		double hypotenuse = Math.sqrt((Math.pow(sideLength1, 2)) + (Math.pow(sideLength2, 2)));
        return sideLength1 + sideLength2 + hypotenuse;
	}

/** 
	* @return Whether point p is inside of the triangle.
	*/
	public boolean isInside(Point p) {
        double p1x = corner.x; 
        double p1y = corner.y;
        double p2x = corner.x + sideLength1;
        double p3y = corner.y + sideLength2;

        if (p.x < p1x || p.x > p2x || p.y < p1y || p.y > p3y) {
            return false;
        }
        double hypotenuseY = -(sideLength2 / sideLength1) * (p.x - corner.x) + (corner.y + sideLength2);

        return p.y <= hypotenuseY;
    }

    /** 
	* @return Whether point p part of/on the border of the triangle.
	*/
	public boolean isOn(Point p) {
        if (p.y == corner.y && p.x >= corner.x && p.x <= corner.x + sideLength1) {
            return true;
        }
        if (p.x == corner.x && p.y >= corner.y && p.y <= corner.y + sideLength2) {
            return true;
        }
        
        double hypotenuseY = -(sideLength2 / sideLength1) * (p.x - corner.x) + (corner.y + sideLength2);

        if (p.y == hypotenuseY && p.x >= corner.x && p.x <= corner.x + sideLength1 && p.y >= corner.y && p.y <= corner.y + sideLength2) {
            return true;
        }

        return false;
    }

    public RightTriangle translate(double x, double y) {
		return new RightTriangle(corner.translateX(x).translateY(y), sideLength1, sideLength2);
    }

    public RightTriangle scale(double k) {
		return new RightTriangle(corner, sideLength1 * k, sideLength2 * k);
	}

    public static boolean similar(RightTriangle T1, RightTriangle T2){
        double ratio1 = T1.sideLength1 / T2.sideLength1;
        double ratio2 = T1.sideLength2 / T2.sideLength2;  
        return ratio1 == ratio2;
    }

}