package library.people;

import library.materials.Book;

import java.time.LocalDate;
import java.util.List;

public class Member extends Person {
    private int memberID;
    private List<Book> borrowedBooks;

    public Member(String fullName, String address, String email){
        super(fullName, address, email);
    }


    public int getBorrowedBooksCount(){
        return borrowedBooks.size();
    }
    public LocalDate getDueDate(Book book){
        return LocalDate.now().plusDays(3);
    }
}
