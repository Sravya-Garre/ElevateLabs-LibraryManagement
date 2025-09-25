package com.nt.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Sample data
        library.addBook(new Book(1, "Java Programming", "James Gosling"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "Clean Code", "Robert C. Martin"));

        library.addUser(new User(101, "Sravya"));
        library.addUser(new User(102, "Savithri"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Show Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Add Book");
            System.out.println("6. Add User");
            System.out.println("7. Show Book Count");
            System.out.println("8. Show User Count");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // to handle nextLine after int input

            switch (choice) {
                case 1 -> library.showBooks();
                case 2 -> library.showUsers();
                case 3 -> {
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    library.issueBook(bookId, userId);
                }
                case 4 -> {
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    library.returnBook(bookId, userId);
                }
                case 5 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    System.out.println("Book added successfully!");
                }
                case 6 -> {
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(id, name));
                    System.out.println("User added successfully!");
                }
                case 7 -> library.showBookCount();
                case 8 -> library.showUserCount();
                case 9 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 9);

        sc.close();
    }
}
