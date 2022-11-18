public class Rectangle extends Figure implements Drawable {

    private double width;
    private double length;

    public Rectangle(double y, double x,double width, double length) {
        super(y, x);
        this.width = width;
        this.length = length;
    }

//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public Rectangle() {
//        this.width = 0.0;
//        this.length = 0.0;
//    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

//    @Override
//    public double getArea() {
//        return width * length;
//    }

    @Override
    public String toString() {
//        return "Rectangle{" +
//                "width=" + width +
//                ", length=" + length +
//                '}';
        return  "This rectangle has the width: " + getWidth() +
                " and the length: " + getLength() ;
//                + " and the area of: " + getArea();
    }

    @Override
    public void draw() {
        double circumference = length * 2 + width * 2;
        System.out.println(circumference);
    }

    public void show() {
        super.show();
        System.out.println("Width = " + width);
        System.out.println("Length = " + length);
    }
}
