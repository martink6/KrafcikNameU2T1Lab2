public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        rect.printArea();
        rect.printBoxVolume(30.75);
        rect.printBoxVolume(40.5);
        int area = rect.calculateArea();
        double vol = rect.calculateBoxVolume(25);
        System.out.printf("Area: %d, Volume: %f", area, vol);
    }
}
