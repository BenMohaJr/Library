# Library Management System in Java

This Git repository contains a simple Library Management System implemented in Java. The system provides basic operations for managing a library, such as adding books, checking out and returning books, removing books, displaying the list of books, displaying waiting queues, searching for a book, and exiting the system.

## How to Run

To run the Library Management System, follow these steps:

1. Clone the repository to your local machine:

```bash
git clone https://github.com/BenMohaJr/Library.git
```

2. Open the project in your preferred Java development environment (e.g., IntelliJ IDEA, Eclipse).

3. Run the `Main` class.

4. Follow the on-screen instructions to perform various library operations.

## Project Structure

- `Main.java`: The main class containing the entry point for the application.
- `Library.java`: The Library class that implements the core functionality of the Library Management System.
- `Operation.java`: An enum representing the possible operations that can be performed in the library.

## Library Operations

The Library Management System supports the following operations:

1. **Add Book**: Add a new book to the library.
2. **CheckOut Book**: Borrow a book from the library.
3. **CheckIn Book**: Return a borrowed book to the library.
4. **Remove Book**: Remove a book from the library.
5. **Display Books**: Display the list of available books in the library.
6. **Display Book Waiting Queue**: Display the waiting queue for a specific book.
7. **Search A Book**: Search for a book by its BookID.
8. **Exit**: Exit the Library Management System.

## Usage Instructions

1. Upon running the program, a menu will be displayed with numbered options for different operations.

2. Enter the corresponding number for the operation you want to perform.

3. Follow the prompts to provide necessary information (e.g., book name, BookID).

4. The system will execute the selected operation and display relevant information.

5. To exit the system, select option 8.

Note: The program handles invalid input gracefully and prompts the user to enter valid information.

Feel free to explore and enhance the functionality of the Library Management System!
