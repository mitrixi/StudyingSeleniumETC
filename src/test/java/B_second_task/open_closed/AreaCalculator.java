package B_second_task.open_closed;

public class AreaCalculator {
    private double area;
    private AreaInterface areaInterface;

    public AreaCalculator(AreaInterface areaInterface) {
        this.areaInterface = areaInterface;
    }

    public void calculate() {
        area = areaInterface.calculateArea();
    }

    public void printArea() {
        System.out.println(area);
    }
}