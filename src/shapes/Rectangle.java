package shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public int getArea() {
       int area = this.length * this.width;
       return area;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getPerimeter() {
        int perimeter = (2 * this.length) + (2 * this.width);
        return perimeter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
//        System.out.println(getArea(24, 15));
//        System.out.println(getPerimeter(12, 12));

    }
}
