import java.util.List;

public class Book {

    private String title;
    private String author;
    private int yearOfPublish;
    private int pages;


    public Book(String title, String author, int yearOfPublish, int pages) {
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Год=" + yearOfPublish +
                ", Кол-во страниц=" + pages +
                '}'+"\n";
    }
}
