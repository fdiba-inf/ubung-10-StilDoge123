package exercise10;

public abstract class Figure implements ClickListener {
    protected Point startPoint;
    protected double side1;
    protected double side2;

    protected Figure(Point startPoint, double side1, double side2) {
        this.startPoint = new Point(startPoint);
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public abstract String getType();

    public String toString() {
        return String.format("%s: %s-[%s, %s], %s, P=%s, A=%s", getClass().getSimpleName(), startPoint, side1, side2, getType(), calculatePerimeter(), calculateArea());
    }

    public void initialize() {
        do {
            System.out.println("Start point: ");
            startPoint.initialize();
            System.out.print("Enter side 1: ");
            side1 = Utils.INPUT.nextDouble();
            System.out.print("Enter side 2: ");
            side2 = Utils.INPUT.nextDouble();
        } while (!isValid());
    }

    public boolean isValid() {
        return side1 > 0 && side2 > 0;
    }

    public boolean equal(Figure otherFigure) {
        boolean sameSide1 = Utils.equals(side1, otherFigure.side1);
        boolean sameSide2 = Utils.equals(side2, otherFigure.side2);
        boolean sameSide1Reversed = Utils.equals(side1, otherFigure.side2);
        boolean sameSide2Reversed = Utils.equals(side2, otherFigure.side1);

        return (sameSide1 && sameSide2) || (sameSide1Reversed && sameSide2Reversed);
    }
}
