package gukas.proj.library;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }

    public String printDetails(){
        return "Book: " + title + ", Author: " + author;
    }
}
