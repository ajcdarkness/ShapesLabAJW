package JacobAngelaWilson;
//Thing that runs and tests the shapes we've created
public class Runner{
    public static void main(String[] args){
        Shape shape1 = new Rectangle(4,5);
        Shape shape2 = new ETriangle(4);
        Shape shape3 = new Circle(4);

        System.out.println(shape3);
        System.out.println("My Perimeter is " + shape3.getPerimeter());
        System.out.println("My Area is " + shape3.getArea());

        Shape[] shapes = {shape1, shape2, shape3};

        for(Shape cur : shapes){
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My Perimeter is: " + cur.getPerimeter());
        }


    }
}

