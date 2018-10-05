package JacobAngelaWilson;
//creates the rectangle class
public class Rectangle extends Shape{
    private int length;
    private int width;
//constructs a rectangle
    public Rectangle(int theLength,int theWidth){
        super("Rectangle");
        length = theLength;
        width = theWidth;
    } //creates getters for area and perimeter
    public double getArea(){
        int area = length * width;
        return area;
    }
    public double getPerimeter(){
        int perimeter = (length*2) + (width*2);
        return perimeter;
    }
}
