package library;

public class Member {
	    private String name;      // Private attribute
	    private String memberId;  // Private attribute

	    // Constructor
	    public Member(String name, String memberId) {
	        this.name = name;
	        this.memberId = memberId;
	    }

	    public String getDetails() {
	        return "Member Name: " + name + ", Member ID: " + memberId;
	    }
	}
