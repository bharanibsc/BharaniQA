package org.collegemutlilevel;
//childclass
public class Student extends Hostel
{
	private void studentName() {
		System.out.println("naveen");
	}
	private void studentDept() {
		System.out.println("science");
	}
	private void studentId() {
		System.out.println("3456");
	}
	public static void main(String[] args) {
		Student h=new Student();
		h.studentName();
		h.studentId();
		h.studentDept();
		h.collegeName();
		h.collegeCode();
		h.collegeRank();
		h.deptName();
		h.HostelName();
	}

}
