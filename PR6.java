class Circle {

    private double x, y, r;

    public Circle() {
        this.x = 2;
        this.y = 2;
        this.r = 3;
    }

    public Circle(double r) {
        this.x = 5;
        this.y = 5;
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double circumference() {
        return 2 * Math.PI * r;
    }

    public double diameter() {
        return 2 * r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }
}

public class PR6 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.err.println("Circle 1");
        System.out.println("X coordinates       : " + c1.getX());
        System.out.println("Y coordinates       : " + c1.getY());
        System.out.println("Radious             : " + c1.getR());
        System.out.println("Area of Circle      : " + c1.area());
        System.out.println("Perimeter of Circle : " + c1.circumference());
        System.out.println("Diameter of Circle  : " + c1.diameter());

        Circle c2 = new Circle(3);
        System.err.println("Circle 2");
        System.out.println("X coordinates       : " + c2.getX());
        System.out.println("Y coordinates       : " + c2.getY());
        System.out.println("Radious             : " + c2.getR());
        System.out.println("Area of Circle      : " + c2.area());
        System.out.println("Perimeter of Circle : " + c2.circumference());
        System.out.println("Diameter of Circle  : " + c2.diameter());

        Circle c3 = new Circle(5, 6, 7);
        System.err.println("Circle 3");
        System.out.println("X coordinates       : " + c3.getX());
        System.out.println("Y coordinates       : " + c3.getY());
        System.out.println("Radious             : " + c3.getR());
        System.out.println("Area of Circle      : " + c3.area());
        System.out.println("Perimeter of Circle : " + c3.circumference());
        System.out.println("Diameter of Circle  : " + c3.diameter());

    }
}
