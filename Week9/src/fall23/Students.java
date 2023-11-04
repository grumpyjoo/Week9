package fall23;

public class Students {
	/*
	 * Student Name: RACHELLE MUYARGAS 
	 * Student ID: 4533324 
	 * Professor: SUMITHRA CHANDRASEKAR
	 */
//	Display course id, course name, college_location
	String fullName;
	int rollNo;
	float fee;
	
	public Students(String fullName, int rollNo, float fee) {
		super();
		this.fullName = fullName;
		this.rollNo = rollNo;
		this.fee = fee;
	}


	void details() {
		System.out.println("Roll No: " + rollNo + " \nFull Name: " + fullName + " \nFee: "+ fee);
		System.out.println("\n");
	}
	
	public static void main(String [] args) {
		System.out.println("STUDENT DETAILS");
		System.out.println("---------------");
		Students s1 = new Students("Luna Roxas", 1, 6200);
		Students s2 = new Students("Asli Forbes", 2, 7100);
		
		s1.details();
		s2.details();
		
	}
}
