package B_second_task.single_responsibility;

public class Printer {
    private Printable content;

    public void setContent(Printable content) {
        this.content = content;
    }

    void print() {
        content.print();
    }
}
