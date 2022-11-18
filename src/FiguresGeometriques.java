public class FiguresGeometriques {
    public static void main(String[] args) {
//        RectangleColore r = new RectangleColore(4.3, 12.5, 4);
//        System.out.println(r.getWidth());

        RectangleColore r = new RectangleColore(1.2,3.4,12.3,43.2,4);
        r.show();
        Circle c = new Circle (2.3, 4.5, 12.2);
        c.show();
    }
}