package B_second_task.single_responsibility;

public class Book implements Printable {
    private String title;
    private String author;
    private String content;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPages() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(String content) {
        this.content = content;
    }

    //нарушение Single responsibility principle
    public void printBook() { }
    //данную логику следует вынести в отдельный класс(смотри класс Printer)

    @Override
    public void print() {

    }
}

