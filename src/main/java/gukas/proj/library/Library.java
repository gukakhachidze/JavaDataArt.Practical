package gukas.proj.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    List<Book> books = new ArrayList<>();

    public Library(String name){
        this.name = name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void showBook(){
        for (Book book : books){
            System.out.println(book.printDetails());
        }
    }
}
