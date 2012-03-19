package harkka;

import java.util.ArrayList;

public class Ticket {
	String ID;
	String status;
	String problem;
	
	ArrayList<WorkUpdate> workUpdates;
	
	
	/*
	 * Luo uuden tiketin ja alustaa workUpdates-muuttujan
	 */
	public Ticket(String id, String status, String problem) {
		this.ID = id;
		this.status = status;
		this.problem = problem;
		
		this.workUpdates = new ArrayList<WorkUpdate>();
	}
	
	public double getTotalHours() {
		
		return 0;
		//TODO:
	}
	
	public void add(WorkUpdate update) {
		workUpdates.add(update);
	}
}
