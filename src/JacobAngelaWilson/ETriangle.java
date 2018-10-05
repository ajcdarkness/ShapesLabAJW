package JacobAngelaWilson;
//creates the equilateral triangle class
public class ETriangle extends Shape
{
    private int side;

    public  ETriangle(int side){
        super("ETriangle");
        this.side = side;
    }//creates the area and perimeter for Etriangles with given side lengths
    public double getArea()
    {
        return (Math.sqrt(3)/4) * side * side;
    }
    public double getPerimeter() {
        return side * 3;
    }
}
