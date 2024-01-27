package library;

import book.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Library implements ILibrary {
    private final List<Book> libraryBooks = new ArrayList();
    private int bookTrackingIndex = 0;
    private static Library single_instance = null;

    private Library() {
    }

    public static synchronized Library getInstance() {
        if (single_instance == null) {
            single_instance = new Library();
        }

        return single_instance;
    }

    public void addBook(String bookName) {
        Iterator var2 = this.libraryBooks.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                ++this.bookTrackingIndex;
                Book newBook = new Book(bookName, this.bookTrackingIndex);
                this.libraryBooks.add(newBook);
                System.out.println("Created A New Book With BookID:" + newBook.getBookID());
                return;
            }

            book = (Book)var2.next();
        } while(!Objects.equals(book.getName(), bookName));

        book.updateAvailableBookCount();
        System.out.println("Book Already Exist In The System, Updating Book Count, Now Book Count is : " + book.getAvailableBookCount());
    }

    public void removeBook(int bookID) {
        Iterator var2 = this.libraryBooks.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                System.out.println("Book-ID Does Not Exist");
                return;
            }

            book = (Book)var2.next();
        } while(book.getBookID() != bookID);

        this.libraryBooks.remove(book);
        System.out.println("Book Has Been Removed");
    }

    public void searchBook(int bookID) {
        Iterator var2 = this.libraryBooks.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                System.out.println("Book Does Not Exist In The System.");
                return;
            }

            book = (Book)var2.next();
        } while(book.getBookID() != bookID);

        System.out.println("Book Has Been Found, The Book Is: " + String.valueOf(book));
    }

    public void displayBooks() {
        Iterator var1 = this.libraryBooks.iterator();

        while(var1.hasNext()) {
            Book book = (Book)var1.next();
            System.out.println(book.toString());
        }

    }

    public void BookWaitingQueue(String bookName) {
        boolean bookExist = false;
        Iterator var3 = this.libraryBooks.iterator();

        while(var3.hasNext()) {
            Book book = (Book)var3.next();
            if (Objects.equals(book.getName(), bookName)) {
                book.getBookQueue();
                bookExist = true;
            }
        }

        if (!bookExist) {
            System.out.println("Book Does Not Exist");
        }

    }

    public void checkOutBook(String bookName) {
        Iterator var2 = this.libraryBooks.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                System.out.println("Book Does Not Exist");
                return;
            }

            book = (Book)var2.next();
        } while(!Objects.equals(bookName, book.getName()));

        if (book.getAvailableBookCount() > 0) {
            book.decreaseAvailableBookCount();
            System.out.println("You Have Taken The Book Successfully, The Amount Remaining is:" + book.getAvailableBookCount());
        } else {
            System.out.println("The Book Exist, But No Available Copies Of It Are In Place");
        }

    }

    public void checkInBook(int bookID) {
        Iterator var2 = this.libraryBooks.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                System.out.println("Book Does Not Exist");
                return;
            }

            book = (Book)var2.next();
        } while(bookID != book.getBookID());

        book.updateAvailableBookCount();
        System.out.println("You Have Returned The Book Successfully, The Amount Remaining is:" + book.getAvailableBookCount());
    }
}
