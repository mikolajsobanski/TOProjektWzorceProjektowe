import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BookTest {

    @Test
    void shouldCreateBook(){

        Book book = new Book(3,"tytul","autor");
        assertAll(
                () -> assertEquals(3, book.getId()),
                () -> assertEquals("tytul", book.getName()),
                () -> assertEquals("autor", book.getAuthor())
        );
    }

    @Test
    void shouldReturnNotNull_whenFieldsUninitializedWithoutRightNames(){
        Book book = new Book(5,"tytul","autor");
        assertNotNull(book.toString());
    }
}
