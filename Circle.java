import java.util.Scanner;

public class Circle implements Movable {

    private Point center;
    private double radius;

    public Circle() {
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Circle(center=" + center + ", radius=" + radius + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter center x: ");
        int x = scanner.nextInt();

        System.out.print("Enter center y: ");
        int y = scanner.nextInt();

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        Point centerPoint = new Point(x, y);
        Circle c = new Circle(centerPoint, radius);

        System.out.println("Original: " + c);

        c.moveUp();
        System.out.println("After moveUp: " + c);

        c.moveDown();
        System.out.println("After moveDown: " + c);

        c.moveLeft();
        System.out.println("After moveLeft: " + c);

        c.moveRight();
        System.out.println("After moveRight: " + c);

        scanner.close();
    }
}