import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private static Library instance = null;

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    //List of books by id, possibly replace with something better later?
    private List<Integer> availableBooks = new ArrayList<>(Arrays.asList(1,2,3,4));


    //TODO: All book operations should be logged into a memento for save/undo
    public Boolean requestBook(int bookId) {
        return availableBooks.remove(Integer.valueOf(bookId));
    }
    public Boolean returnBook(int bookId) {
        return availableBooks.add(bookId);
    }

    public String totoString() {
        return availableBooks.toString();
    }
    //TODO: Create a Composite for Clients and AdminClients
    //TODO: and an Iterator for iterating over that Composite
}
