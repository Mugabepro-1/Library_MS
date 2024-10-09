package library;

import library.materials.Book;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(String title, String author, boolean isAvailable){
        Book newBook = new Book("", "", true);
        books.add(newBook);
        System.out.println("Book" +title + "Added successfully");
    }
    public void removeBook(String tile){
        for(Book book : books){
            if(book.getTitle().equals(tile)){
                books.remove(book);
                System.out.println("Book" + book.getTitle()+ "removed successfully.");
                return;
            }
        }
        System.out.println("Book not found");
    }
    public void issueBook(String title, String )

}
