package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int length, int width) {
        super(length, width);
    }
//    protected int width;
//    protected int length;

    @Override
    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public int getArea() {
        return length * width;
    }
//
//    public int getArea() {
//       int area = this.length * this.width;
//        System.out.println("Rectangle getArea");
//       return area;
//       return length * width; also still good to use
//    }

//    public int getPerimeter() {
//        int perimeter = (2 * this.length) + (2 * this.width);
//        System.out.println("Rectangle getPerimeter");
//        return perimeter;
////        return (2 * this.length) + (2 * this.width); good to use
//    }
//
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }

    public static void main(String[] args) {
//        System.out.println(getArea(24, 15));
//        System.out.println(getPerimeter(12, 12));

    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
