 Library Management System (Java Console Application)

This is a simple Library Management System built using Core Java.  
It allows you to manage Books and Users, issue and return books, and view details in a console-based menu system.

=> Features:-
-> Add new Books to the library  
-> Add new Users 
-> Show all available Books  
-> Show all registered Users  
-> Issue a Book to a User (if available)  
-> Return a Book from a User  
-> Show total number of Books  
-> Show total number of Users  
------------------------------------
=> Project Structure
com.nt.main/
├── Book.java # Book details (ID, title, author, issued status)
├── User.java # User details (ID, name, issued books list)
├── Library.java # Main library logic (add, issue, return, show)
└── Main.java # Console menu (entry point of the program)
================================================================
1. Book Class
- Stores details like `id`, `title`, `author`
- Tracks if the book is issued or available
- Methods:
  - `issueBook()` → Marks book as issued  
  - `returnBook()` → Marks book as available  
 2. User Class
- Stores `id`, `name`, and the list of issued books
- Methods:
  - `issueBook(Book book)` → Adds book to user's list  
  - `returnBook(Book book)` → Removes book from user's list  
 3. Library Class
- Maintains a list of Books and Users
- Core functions:
  - `addBook(Book book)`
  - `addUser(User user)`
  - `issueBook(bookId, userId)`
  - `returnBook(bookId, userId)`
  - `showBooks()`, `showUsers()`
  - `showBookCount()`, `showUserCount()`

 4. Main Class
- Provides a menu-driven console application
- Uses a `Scanner` to take input from the user
- Options include:
  1. Show Books  
  2. Show Users  
  3. Issue Book  
  4. Return Book  
  5. Add Book  
  6. Add User  
  7. Show Book Count  
  8. Show User Count  
  9. Exit
=========================================
 How to Run
1. Clone this repository:
   bash
   git clone https://github.com/your-username/library-management-system.git
Open the project in Eclipse IDE.

Run the Main.java file.

 Sample Output:-

--- Library Menu ---
1. Show Books
2. Show Users
3. Issue Book
4. Return Book
5. Add Book
6. Add User
7. Show Book Count
8. Show User Count
9. Exit
Enter your choice:

👩‍💻 Author
Developed by Sravya
📧 Feel free to suggest improvements or fork this project!
