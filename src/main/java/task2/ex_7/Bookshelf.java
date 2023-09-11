package task2.ex_7;

import java.util.Arrays;

public class Bookshelf {
    private Book[] books;
    private int numberOfBooks;

    public Bookshelf(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Книжная полка заполнена. Нельзя добавить больше книг.");
        }
    }

    public Book getLatestBook() {
        if (numberOfBooks == 0) {
            return null;
        }
        Book latestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYearPublished() > latestBook.getYearPublished()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book getOldestBook() {
        if (numberOfBooks == 0) {
            return null;
        }
        Book oldestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYearPublished() < oldestBook.getYearPublished()) {
                oldestBook = books[i];
            }
        }
        return oldestBook;
    }

    public void sortBooksByYear() {
        Arrays.sort(books, 0, numberOfBooks, (book1, book2) ->
                Integer.compare(book1.getYearPublished(), book2.getYearPublished()));
    }

    public void displayBooks() {
        System.out.println("Список книг на книжной полке:");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(5);

        Book book1 = new Book("Книга 1", "Автор 1", 2000);
        Book book2 = new Book("Книга 2", "Автор 2", 1995);
        Book book3 = new Book("Книга 3", "Автор 3", 2010);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        bookshelf.displayBooks();

        Book latestBook = bookshelf.getLatestBook();
        if (latestBook != null) {
            System.out.println("\nСамая поздняя книга:");
            System.out.println(latestBook);
        } else {
            System.out.println("\nКнижная полка пуста.");
        }

        Book oldestBook = bookshelf.getOldestBook();
        if (oldestBook != null) {
            System.out.println("\nСамая старая книга:");
            System.out.println(oldestBook);
        } else {
            System.out.println("\nКнижная полка пуста.");
        }

        bookshelf.sortBooksByYear();
        System.out.println("\nСортированный список книг по году издания:");
        bookshelf.displayBooks();
    }
}