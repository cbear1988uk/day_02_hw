import java.util.ArrayList;

public class Borrower {

    private ArrayList<Books> books;
    private Integer collection;

    public Borrower(Integer collection){
        this.books = new ArrayList<Books>();
        this.collection = collection;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void takeBook(Books books) {
        this.books.add(books);
    }

    public void checkoutBook(Library library) {
        Books books = library.remove();
        this.books.add(books);
    }
}
