//EXTRA CREDIT: create square
package JacobAngelaWilson;
//creates a square class
public class Square extends Shape{
    private int length;
//Constructs squares
    public Square(int Thelength){
        super("Square");
        length = Thelength;
    }//creates getters for area and perimeter with given side lengths
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
