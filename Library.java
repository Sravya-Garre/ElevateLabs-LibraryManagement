package com.nt.main;
import java.util.*;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Add user
    public void addUser(User user) {
        users.add(user);
    }

    // Issue book
    public void issueBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book != null && user != null && !book.isIssued()) {
            book.issueBook();
            user.issueBook(book);
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book cannot be issued.");
        }
    }

    // Return book
    public void returnBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book != null && user != null && book.isIssued()) {
            book.returnBook();
            user.returnBook(book);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book cannot be returned.");
        }
    }

    // Find book
    private Book findBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    // Find user
    private User findUser(int id) {
        for (User u : users) {
            if (u.getId() == id) return u;
        }
        return null;
    }

    // Show all books
    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Show all users
    public void showUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }
 // Show total number of books
    public void showBookCount() {
        System.out.println("Total Books in Library: " + books.size());
    }

    // Show total number of users
    public void showUserCount() {
        System.out.println("Total Users in Library: " + users.size());
    }

}

