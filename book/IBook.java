package book;

public interface IBook {
    BookStatus getStatus();

    void setStatus(BookStatus var1);

    void addBookCount();

    void decreaseBookCount();

    String getName();

    void getBookQueue();

    int getAvailableBookCount();

    void decreaseAvailableBookCount();

    void updateAvailableBookCount();

    int getBookID();
}
