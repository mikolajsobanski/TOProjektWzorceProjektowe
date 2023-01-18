import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Library implements BookOperation {

    private static Library instance = null;

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    //List of books by id, possibly replace with something better later?

    private List<Book> books = new ArrayList<>(Arrays.asList(new Book(1,"Harry Potter i kamien filozoficzny","J.K.Rowling"),new Book(2,"Harry Potter i komnata tajemnic","J.K.Rowling"),new Book(3,"Harry Potter i więzień Azkabanu","J.K.Rowling"),new Book(4,"Harry Potter i Czara Ognia","J.K.Rowling")));

    List<Book> getBooks(){
        return books;
    }

    //TODO: All book operations should be logged into a memento for save/undo


    @Override
    public void requestBook(Integer id) {
        books.removeIf(e -> e.getId().equals(id));
    }

    @Override
    public void returnBook(Book book) {
        books.add(book);
    }

    @Override
    public void showBooks() {
        System.out.println(books.toString());
    }

    //TODO: Create a Composite for Clients and AdminClients
    //TODO: and an Iterator for iterating over that Composite
}
