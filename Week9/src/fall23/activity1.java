package fall23;
import java.util.*;

public class activity1 {
	/*
	 * Student Name: RACHELLE MUYARGAS 
	 * Student ID: 4533324 
	 * Professor: SUMITHRA CHANDRASEKAR
	 */
	
	Scanner sc = new Scanner(System.in);
	
	//employee
	public void Employee(String name, String loc, double sal) {
		System.out.printf("EMPLOYEE INFORMATION" );
		System.out.printf("\n-------------------");
		System.out.printf("\nName: "+ name + "\nLocation: "+ loc + "\nSalary: " + sal);
	}

	
	//course 
	public void Course(String courseName, String courseID, String collegeLoc) {
		System.out.printf("\n");
		System.out.printf("\nCOURSE INFORMATION");
		System.out.printf("\n-------------------");
		System.out.printf("\nCourse Name: "+ courseName + "\nCourse ID: " + courseID + "\nCollege Location: " + collegeLoc);
	}
	

	public static void main(String[] args) {
		
		activity1 emp = new activity1();
		emp.Employee("Zoey", "North York", 560.55);
		
		activity1 crs = new activity1();
		crs.Course("Object Oriented Software Development", "PROG1124", "Mirvish Village");
	}

}