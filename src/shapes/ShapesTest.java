package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle today = new Rectangle(6, 7);
//        System.out.println(today.getArea());
//        System.out.println(today.getPerimeter());
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable shape3 = new Square(6, 6);
            System.out.println(shape3.getArea());
            System.out.println(shape3.getPerimeter());
        Measurable shape4 = new Rectangle(6, 8);
            System.out.println(shape4.getArea());
            System.out.println(shape4.getPerimeter());

    }
}
