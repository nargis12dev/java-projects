package library;

public class Librarian  extends Member {
	    private String employeeId; // Private attribute

	    // Constructor
	    public Librarian(String name, String memberId, String employeeId) {
	        super(name, memberId); // Call the constructor of the parent class
	        this.employeeId = employeeId;
	    }

	    @Override
	    public String getDetails() {
	        return super.getDetails() + ", Employee ID: " + employeeId;
	    }
	}

