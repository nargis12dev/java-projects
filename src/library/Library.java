package library;
import java.util.ArrayList;
import java.util.List;
public class Library {
	 private List<Book> books;
	 private List<Member> members;
 public Library() {// Constructor
	books = new ArrayList<>();
 members = new ArrayList<>();
	    }
	    public void addBook(Book book) {
	    books.add(book);
	    }
	    public void addMember(Member member) {
	     members.add(member);
	    }
	    public void showBooks() {
	    for (Book book : books) {
	    System.out.println(book.getDetails());
	        }
	    }
	    public void showMembers() {
	    for (Member member : members) {
	            System.out.println(member.getDetails());
	        }
	    }
	    public void borrowBook(String title) {
	    for (Book book : books) {
	    if (book.getDetails().contains(title)) {
	     book.borrow();
	      return;
	            }
	        }
	        System.out.println("Book not found.");
	    }
	    public void returnBook(String title) {
	        for (Book book : books) {
	            if (book.getDetails().contains(title)) {
	                book.returnBook();
	                return;
	            }
	        }
	        System.out.println("Book not found.");
	    }
	}

