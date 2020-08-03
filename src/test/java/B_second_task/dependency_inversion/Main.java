package B_second_task.dependency_inversion;

public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(new EngineV8());
        ferrari.startEngine();
    }
}

