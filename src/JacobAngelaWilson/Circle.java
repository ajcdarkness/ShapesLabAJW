package JacobAngelaWilson;
//creates circle class
public class Circle extends Shape{
    private int radius;

    //specifies radius
    public Circle(int theRadius){
        super("Circle");
        radius = theRadius;
    }//returns area
    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
    //returns perimeter
    public double getPerimeter(){
        double perimeter = 2*Math.PI * radius;
        return perimeter;
    }
}
