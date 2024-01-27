package book;

import java.util.PriorityQueue;

public class Book implements IBook {
    private final String bookName;
    private final int bookID;
    private int bookCount;
    private int availableBookCount;
    private PriorityQueue<String> bookQueue;

    public Book(String bookName, int bookID) {
        this.bookQueue = new PriorityQueue();
        this.bookName = bookName;
        this.bookID = bookID;
        this.bookCount = 1;
        this.availableBookCount = 1;
    }

    public Book(String unknown) {
        this(unknown, 0);
    }

    public BookStatus getStatus() {
        return null;
    }

    public void setStatus(BookStatus status) {
    }

    public void addBookCount() {
        ++this.bookCount;
    }

    public void decreaseBookCount() {
        --this.bookCount;
    }

    public String getName() {
        return this.bookName;
    }

    public void getBookQueue() {
        System.out.println(this.bookQueue);
    }

    public int getAvailableBookCount() {
        return this.availableBookCount;
    }

    public void decreaseAvailableBookCount() {
        --this.availableBookCount;
    }

    public void updateAvailableBookCount() {
        ++this.availableBookCount;
    }

    public int getBookID() {
        return this.bookID;
    }

    public String toString() {
        return "Book [id=" + this.bookID + ", Name=" + this.bookName + ", Available Copies=" + this.availableBookCount + ", Overall Book Count" + this.bookCount + "]";
    }
}
