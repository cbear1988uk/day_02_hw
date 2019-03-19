import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public Library library;
    public Books books;

    @Before
    public void setup(){
        library = new Library("Hillhead Library", 10);
        books = new Books("The Vertical Plane", "K. Webster", "Mystery");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void bookCapacity(){
        assertEquals(10, library.maxCapacity());
    }

    @Test
    public void libraryHasBooks(){
        library.add(books);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBooks(){
        library.add(books);
        library.remove();
        assertEquals(0, library.bookCount());
    }


}
