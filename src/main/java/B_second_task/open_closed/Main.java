package B_second_task.open_closed;

public class Main {
    public static void main(String[] args) {

        AreaCalculator areaCalculator = new AreaCalculator(new Circle(5));
        areaCalculator.calculate();
        areaCalculator.printArea();

        areaCalculator = new AreaCalculator(new Rectangle(5, 3));
        areaCalculator.calculate();
        areaCalculator.printArea();
    }
}