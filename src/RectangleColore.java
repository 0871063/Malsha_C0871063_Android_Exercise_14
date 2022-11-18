public class RectangleColore extends Rectangle{
    private int color;

    public RectangleColore(double x, double y,double width, double length, int color){
        super(x, y,width, length);
        this.color = color;
    }

    public void show() {
        super.show();
        System.out.println("Color = " + color);
    }
}
