package JacobAngelaWilson;

public class ETriangle extends Shape
{
    //defines the sides
    private int side;
    // specifies sides based on the values given
    public  ETriangle(int side){
        super("ETriangle");
        this.side = side;
    }
    //returns area based on given side lengths
    public double getArea()
    {
        return (Math.sqrt(3)/4) * side * side;
    }
    //returns perimeter based on given sides
    public double getPerimeter() {
        return side * 3;
    }
}
