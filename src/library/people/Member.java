package library.people;

import library.materials.Book;

import java.util.List;

public class Member extends Person {
    private int memberID;
    private List<Book> borrowedBooks;

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
    public int getBorrowedBooksCount(){
        return borrowedBooks.size();
    }

}
