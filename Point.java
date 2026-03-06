import java.util.Scanner;

public class Point implements Movable {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        Point p = new Point(x, y);

        System.out.println("Original: " + p);

        p.moveUp();
        System.out.println("After moveUp: " + p);

        p.moveDown();
        System.out.println("After moveDown: " + p);

        p.moveLeft();
        System.out.println("After moveLeft: " + p);

        p.moveRight();
        System.out.println("After moveRight: " + p);

        scanner.close();
    }
}