package harkka;

import java.sql.Date;

public class WorkUpdate {
	Employee employee;
	String ID;
	String comment;
	Date startingTime;
	double hours;
	
	public WorkUpdate(Employee e, String id, String comment, Date startingTime, double hours) {
		this.employee = e;
		this.ID = id;
		this.comment = comment;
		this.startingTime = startingTime;
		this.hours = hours;
	}
	
}
