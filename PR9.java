// Write a java program to create an abstract class named Shape that contains two
// integers and abstract methods named area() and perimeter(). Provide three classes
// named Rectangle, Triangle and Circle such that each one of the classes extends the
// class
// Shape. Each one of the classes contains all possible constructor(s) and overridden
// methods
// 1) public double area() that calculate and return area of the given shape. And
// 2) public double perimeter() that calculates and returns circumference/perimeter
// of the given shape.
/**
 * PR9
 */
abstract class Shape {

  int x,y;
  
  abstract public double area();
  abstract public double perimeter();
}
class Rectangle extends Shape
{

    public Rectangle()
    {

        x=10;
        y=20;
    }
    public Rectangle(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public double area()
    {
        
        return x*y;
    }
    public double perimeter()
    {
        return (x+y)*2;
    }
}
class Triangle extends Shape
{
    int z;
    public Triangle()
    {

        x=10;
        y=20;
        z=15;
    }
    public Triangle(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double area()
    {
        
        return (x*y)/2;
    }
    public double perimeter()
    {
        return x+y+z;
    }
}
class Circle extends Shape
{
    public Circle()
    {

        x=10;
    }
    public Circle(int x)
    {
        this.x=x;
    }
    public double area()
    {
        
        return Math.PI*x*x;
    }
    public double perimeter()
    {
        return 2*Math.PI*x;
    }
}
public class PR9 {
public static void main(String[] args) {
    System.out.println("Calculate Ractangle operation using Default constructor");
    Rectangle r1=new Rectangle();
    System.out.println("Area of ractangle      : "+r1.area());
    System.out.println("Perimeter of ractangle : "+r1.perimeter());
    System.out.println("-------------------------------------------------------------");
    System.out.println("Calculate Ractangle operation using Perameterized constructor");
    Rectangle r2=new Rectangle(15,25);
    System.out.println("Area of ractangle      : "+r2.area());
    System.out.println("Perimeter of ractangle : "+r2.perimeter());
    System.out.println("-------------------------------------------------------------");
    System.out.println("Calculate Triangle operation using Default constructor");
    Triangle t1=new Triangle();
    System.out.println("Area of Triangle      : "+t1.area());
    System.out.println("Perimeter of Triangle : "+t1.perimeter());
    System.out.println("-------------------------------------------------------------");
    System.out.println("Calculate Triangle operation using Perameterized constructor");
    Triangle t2=new Triangle(16,12,18);
    System.out.println("Area of Triangle      : "+t2.area());
    System.out.println("Perimeter of Triangle : "+t2.perimeter());
    System.out.println("-------------------------------------------------------------");
    System.out.println("Calculate Circle operation using Default constructor");
    Circle c1=new Circle();
    System.out.println("Area of Circle      : "+c1.area());
    System.out.println("Perimeter of Circle : "+c1.perimeter());
    System.out.println("-------------------------------------------------------------");
    System.out.println("Calculate Circle operation using Perameterized constructor");
    Circle c2=new Circle(5);
    System.out.println("Area of Circle      : "+c2.area());
    System.out.println("Perimeter of Circle : "+c2.perimeter());
}
    
}
