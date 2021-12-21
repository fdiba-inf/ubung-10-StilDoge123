package exercise10;

public class ClickDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.initialize();

        Ellipse ellipse = new Ellipse();
        ellipse.initialize();

        Point clickPoint = new Point();
        clickPoint.initialize();

        ClickListener[] clickListeners = new ClickListener[2];
        clickListeners[0] = rectangle;
        clickListeners[1] = (ClickListener) ellipse; // Cast should be removed after Ellipse implements ClickListener

        for (int i = 0; i < clickListeners.length; i++) {
            boolean pointInside = clickListeners[i].containsClick(clickPoint);
            System.out.println("ClickListener " + i + " contains click point: " + pointInside);
        }
    }
}
