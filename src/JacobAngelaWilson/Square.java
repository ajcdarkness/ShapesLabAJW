package JacobAngelaWilson;

public class Square extends Shape{
    private int length;

    public Square(int Thelength){
        super("Square");
        length = Thelength;
    }
    public double getArea (){
        int area = length * length;
        System.out.println(area);
        return area;
    }
    public double getPerimeter(){
        int perimeter = length * 4;
        System.out.println(perimeter);
        return perimeter;

    }
}