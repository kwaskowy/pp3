public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.area());
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.area());
        Circle  circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(triangle.perimeter());
        System.out.println(circle.perimeter());
        

    }
    
}
