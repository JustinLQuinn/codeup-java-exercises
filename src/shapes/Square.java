package shapes;

public class Square extends Rectangle{
    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
//        int area = (int) (Math.pow(width, 2));
//        return area;
//        System.out.println("Square getArea"); use to test output
//        return (int) (Math.pow(width, 2));
        return width ^ 2;
    }

    @Override
    public int getPerimeter() {
//        int perimeter = 4 * length;
//        return perimeter;
//        System.out.println("Square getPerimeter"); use to test output
        return 4 * length;
    }
    public void setSide(int side){
        this.length = side;
        this.width = side;
}
    public static void main(String[] args) {

    }
}
