package JacobAngelaWilson;

public class Circle extends Shape{
    private int radius;

    public Circle(int theRadius){
        super("Circle");
        radius = theRadius;
    }
    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*Math.PI * radius;
        return perimeter;
    }
}