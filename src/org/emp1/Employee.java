package org.emp1;

import org.client.Client;
import org.company1.Company;
import org.project.Project;

public class Employee {
	
	private void empName() {
		System.out.println("Lokesh");

	}
	
	public static void main(String[] args) {
		Employee r=new Employee();
		r.empName();
		
		Company t=new Company();
		t.companyName();
		
		Client q=new Client();
		q.clientName();
		
		Project e=new Project();
		e.projectName();
		
	}

}
