package B_second_task.barbara_liskov;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.someMethod(new Child(5));
    }
}
