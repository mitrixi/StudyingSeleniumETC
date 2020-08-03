package B_second_task.open_closed;

public class Rectangle implements AreaInterface {
    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return height * width;
    }
}