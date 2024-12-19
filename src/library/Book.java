package library;

public class Book {
	    private String title;  
	    private String author;
	    private String isbn;   
	    private boolean isAvailable; 
	    public Book(String title, String author, String isbn) {// Constructor
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.isAvailable = true; // Book is available by default
	    }
	    // Abstraction: Providing a simple interface to interact with the book
	    public String getDetails() {
	        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable;
	    }
	    public boolean isAvailable() {
	        return isAvailable;
	    }
	    public void borrow() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println("You have borrowed: " + title);
	        } else {
	            System.out.println("Sorry, " + title + " is currently not available.");
	        }
	    }
  public void returnBook() {
	        isAvailable = true;
	        System.out.println("You have returned: " + title);
	    }
	}
