package shapes;

public class ShapesTest {
    public static void main(String[] args) {


        Square box2 = new Square(5);
        System.out.println("Square Area is: "+ box2.getArea());
        System.out.println("Square Perimeter is: "+ box2.getPerimeter());

        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Rectangle Area is: "+ box1.getArea());
        System.out.println("Rectangle Perimeter is: "+ box1.getPerimeter());
    }

}
