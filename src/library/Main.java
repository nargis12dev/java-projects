package library;
import library.*;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("harry potter and the cursed child", "jk rowlings", "123456789"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "987654321"));
        library.addMember(new Student("Alice", "S001", "Computer Science"));
        library.addMember(new Librarian("harry potter", "L001", "E123"));
        System.out.println("Books in the Library:");
        library.showBooks();
        System.out.println("\nMembers of the Library:");
        library.showMembers();
        System.out.println("\nAttempting to borrow '1984':");
        library.borrowBook("1984");
        System.out.println("\nBooks in the Library after borrowing:");
        library.showBooks();
        System.out.println("\nAttempting to return '1984':");
        library.returnBook("1984");
        System.out.println("\nBooks in the Library after returning:");
        library.showBooks();
    }
}