public class Circle extends Figure implements Drawable {
    private double radius;

    private double y;
    private double x;

    public Circle(double y, double x, double r) {
        super(y, x);
        this.radius = r;
    }


//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public Circle(double radius, double y, double x) {
//        this.radius = radius;
//        this.y = y;
//        this.x = x;
//    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if (r < 0.0) {
            r = 0.0;
        }
        radius = r;

    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInside(double x, double y) {
        return (((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) <= radius * radius);
    }

//    @Override
//    public double getArea() {
//        return Math.PI * Math.pow(radius, 2);
//    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void draw() {
        double circumference = 2 * Math.PI * radius;
        System.out.println(circumference);
    }

    public void show() {
        super.show();
        System.out.println("radius = " + radius);
    }
}

