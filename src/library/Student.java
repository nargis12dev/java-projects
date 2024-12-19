package library;

public class Student  extends Member {
	    private String course; // Private attribute

	    // Constructor
	    public Student(String name, String memberId, String course) {
	        super(name, memberId); // Call the constructor of the parent class
	        this.course = course;
	    }

	    @Override
	    public String getDetails() {
	        return super.getDetails() + ", Course: " + course;
	    }
	}
