public class Figure {

    private double y;
    private double x;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Figure(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public void show() {
        System.out.printf("Center Coordinate : (%.1f , %.1f)" , x, y);
    }
}
