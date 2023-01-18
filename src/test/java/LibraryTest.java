import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void shouldCreateLibrary(){
        Library library = new Library();
        assertNotNull(library.toString());
    }

    @Test
    void shouldReturnBooks() {
        Library library = new Library();
       assertNotNull(library.getBooks());
    }

    @Test
    void shouldNotReturnBooksAfterLandBooks() {
        Library library = new Library();
        library.requestBook(1);
        library.requestBook(2);
        library.requestBook(3);
        library.requestBook(4);
        assertEquals(0,library.getBooks().size());
    }

    @Test
    void shouldReturnMoreBooksAfterReturnBook(){
        Library library = new Library();
        library.returnBook(new Book(5,"Harry Potter and the Half-Blood Prince","J.K.Rowling"));
        assertEquals(5,library.getBooks().size());
    }
}
