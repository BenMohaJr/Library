
package library;

public interface ILibrary {
    void addBook(String var1);

    void removeBook(int var1);

    void searchBook(int var1);

    void displayBooks();

    void BookWaitingQueue(String var1);

    void checkOutBook(String var1);

    void checkInBook(int var1);
}
