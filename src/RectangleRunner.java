public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        int area = rect1.calculateArea();
        double volume = rect1.calculateBoxVolume(25);
        System.out.println("This rectangle has an area of " + area + " and a volume of " + volume);

    }
}
