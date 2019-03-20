import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Books> books;
    private Integer capacity;

    public Library(String name, Integer capacity){
        this.name = name;
        this.books = new ArrayList<Books>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void add(Books books) {
        if(bookCount() < this.capacity){
            this.books.add(books);
        }
    }

    public int maxCapacity() {
        return this.capacity;
    }

    public Books remove() {
        return this.books.remove(0);
    }
}
