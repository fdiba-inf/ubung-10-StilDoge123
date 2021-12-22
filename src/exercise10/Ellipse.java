package exercise10;

public class Ellipse extends Figure{
    private Point startPoint;
    private double a;
    private double b;

    public Ellipse() {
        super(new Point(0,0),0,0);
    }

    public Ellipse(Point startPoint, double a, double b) {
        super(startPoint, a, b);
    }

    public Ellipse(Ellipse otherEllipse) {
        super(otherEllipse.startPoint, otherEllipse.a, otherEllipse.b);
    }

    public boolean isValid() {
        return a > 0 && b > 0;
    }

    public void initialize() {
        do {
            startPoint.initialize();
            a = Utils.INPUT.nextDouble();
            b = Utils.INPUT.nextDouble();
        } while (!isValid());
    }
    @Override
    public double calculatePerimeter() {
        return Math.PI * (3.0 * (a + b) - Math.sqrt((3.0 * a + b) * (a + 3.0 * b)));
    }
    @Override
    public double calculateArea() {
        return Math.PI * a * b;
    }
    @Override
    public String getType() {
        return (a == b) ? "Circle" : "Ellipse";
    }
    @Override
    public String toString() {
        return String.format("%s-[%s, %s], %s, P=%s, A=%s", startPoint, a, b, getType(), calculatePerimeter(), calculateArea());
    }
    @Override
    public boolean equal(Figure otherFigure) {
        if(otherFigure instanceof Ellipse){
            return super.equal(otherFigure);
        }
        else {
            return false;
        }
    }
    @Override
    public boolean containsClick(Point click) {
        double clickX = click.getX();
        double clickY = click.getY();

        double centerX = startPoint.getX();
        double centerY = startPoint.getY();

        double part1 = (clickX - centerX) * (clickX - centerX) / (a * a);
        double part2 = (clickY - centerY) * (clickY - centerY) / (b * b);

        return (part1 + part2) <= 1;
    }
}
