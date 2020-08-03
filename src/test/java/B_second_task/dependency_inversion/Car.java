package B_second_task.dependency_inversion;

abstract class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.start();
    }
}
