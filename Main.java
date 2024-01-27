//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.InputMismatchException;
import java.util.Scanner;
import library.Library;

public class Main {
    public static final String operationSelector = "Choose operation to perform: \n1: Add Book.\n2: CheckOut Book\n3: CheckIn Book\n4: Remove Book\n5: Display Books\n6: Display Book Waiting Queue\n7: Search A Book\n8: Exit";

    public Main() {
    }

    public static void main(String[] args) {
        runLibrary();
    }

    private static void runLibrary() {
        Library library = Library.getInstance();

        try {
            Scanner scanner = new Scanner(System.in);

            try {
                while(true) {
                    System.out.println("Choose operation to perform: \n1: Add Book.\n2: CheckOut Book\n3: CheckIn Book\n4: Remove Book\n5: Display Books\n6: Display Book Waiting Queue\n7: Search A Book\n8: Exit");

                    try {
                        int input = scanner.nextInt();
                        String bookName;
                        switch (Operation.values()[input - 1]) {
                            case AddBook:
                                System.out.println("Please Insert The Name Of The New Book:");
                                bookName = scanner.next();
                                library.addBook(bookName);
                                break;
                            case CheckOutBook:
                                System.out.println("Please Insert The Name Of The Book You Want To Take");
                                bookName = scanner.next();
                                library.checkOutBook(bookName);
                                break;
                            case CheckInBook:
                                System.out.println("Please Insert The BookID Of The Book You Want To Return");
                                input = scanner.nextInt();
                                library.checkInBook(input);
                                break;
                            case RemoveBook:
                                System.out.println("Please Insert The BookID Of The Book You Want To Remove");
                                input = scanner.nextInt();
                                library.removeBook(input);
                                break;
                            case DisplayBook:
                                System.out.println("Performing DisplayBook operation...");
                                library.displayBooks();
                                break;
                            case DisplayBookWaitingQueue:
                                System.out.println("Please Insert The Name Of The Book You Want To See Waiting Queue For");
                                bookName = scanner.next();
                                library.BookWaitingQueue(bookName);
                                break;
                            case SearchBook:
                                System.out.println("Please Insert The BookID Of The Book You Want To Search");
                                input = scanner.nextInt();
                                library.searchBook(input);
                                break;
                            case Exit:
                                System.out.println("Exiting...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid input. Please choose a valid operation.");
                        }
                    } catch (InputMismatchException var5) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.nextLine();
                    }
                }
            } catch (Throwable var6) {
                try {
                    scanner.close();
                } catch (Throwable var4) {
                    var6.addSuppressed(var4);
                }

                throw var6;
            }
        } catch (Exception var7) {
            System.out.println(var7.toString());
            runLibrary();
        }
    }
}
