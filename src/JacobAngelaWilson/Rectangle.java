package JacobAngelaWilson;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int theLength,int theWidth){
        super("Rectangle");
        length = theLength;
        width = theWidth;
    }
    public double getArea(){
        int area = length * width;
        return area;
    }
    public double getPerimeter(){
        int perimeter = (length*2) + (width*2);
        return perimeter;
    }
}
