package shapes;

public class ShapesTest {
    Measurable myShape;
    public static void main(String[] args) {





        Square box2 = new Square(5);
        Measurable myShape = box2;
        System.out.println("Square Area is: "+ myShape.getArea());
        System.out.println("Square Perimeter is: "+ myShape.getPerimeter());

        Rectangle box1 = new Rectangle(4,5);
        myShape = box1;

        System.out.println("Rectangle Area is: "+ myShape.getArea());
        System.out.println("Rectangle Perimeter is: "+ myShape.getPerimeter());
    }

}
