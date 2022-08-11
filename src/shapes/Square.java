package shapes;

public class Square extends Rectangle{
    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        int area = (int) (Math.pow(width, 2));
        return area;
    }

    @Override
    public int getPerimeter() {
        int perimeter = 4 * length;
        return perimeter;
    }

    public static void main(String[] args) {

    }
}
