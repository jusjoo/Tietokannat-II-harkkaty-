package harkka;

import java.util.ArrayList;

public class Customer {

	String ID;
	String name;
	String email;
	
	ArrayList<Ticket> tickets;
	
	public Customer(String id, String name, String email) {
		this.ID = id;
		this.name = name;
		this.email = email;	
		
		tickets = new ArrayList<Ticket>();
	}
	
	public void add(Ticket t) {
		tickets.add(t);
	}
}
