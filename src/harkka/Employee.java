package harkka;

import java.util.ArrayList;


public class Employee {
	String ID;
	String name;
	String email;
	
	ArrayList<WorkUpdate> workUpdates;
	
	public Employee(String id, String name, String email) {
		this.ID = id;
		this.name = name;
		this.email = email;
		
		workUpdates = new ArrayList<WorkUpdate>();
	}
	
	public void add(WorkUpdate update) {
		workUpdates.add(update);
	}
}
