package LibraryManagement;

// Book class
class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

// Member class
class Member {
    String name;
    int memberId;

    Member(String n, int id) {
        name = n;
        memberId = id;
    }

    void displayMember() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}

// Main class
public class LibraryTest {
    public static void main(String[] args) {

        Book b = new Book("Java Programming", "James Gosling", "12345");
        Member m = new Member("Rahul", 1);

        System.out.println("---- Book Details ----");
        b.displayBook();

        System.out.println("---- Member Details ----");
        m.displayMember();
    }
}