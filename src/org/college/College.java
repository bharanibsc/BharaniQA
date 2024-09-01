package org.college;

public class College {
	
	private void collegeName() {
		System.out.println("SRM University");

	}
	
	private void collegeCode() {
		System.out.println("484832");

	}
	private void collegeRank() {
		System.out.println("10");

	}
	
	public static void main(String[] args) {
		College r=new College();
		r.collegeName();
		r.collegeCode();
		r.collegeRank();
		
		Student y=new Student();
		y.studentName();
		y.studentDept();
		y.studentId();
		
		Hostel m=new Hostel();
		m.hostelName();
		
		Dept o=new Dept();
		o.deptName();
	}

}
