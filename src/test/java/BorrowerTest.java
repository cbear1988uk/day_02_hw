import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

   private Borrower borrower;
   private Books books;
   private Library library;

   @Before
    public void setup(){
       borrower = new Borrower(3);
       books = new Books("Harry Potter and the Questionable Ethics", "JK Rowling", "Children's Witchcraft");
       library = new Library("William's Library", 5);
       library.add(books);
   }

   @Test
    public void collectionStartEmpty(){
       assertEquals(0, borrower.bookCount());
   }

   @Test
    public void borrowBook(){
       borrower.takeBook(books);
   }

   @Test
    public void takeBookFromLibraryStock(){
       borrower.checkoutBook(library);
       assertEquals(1, borrower.bookCount());
       assertEquals(0, library.bookCount());
   }
}
