package B_second_task.open_closed;

public class Circle implements AreaInterface {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}