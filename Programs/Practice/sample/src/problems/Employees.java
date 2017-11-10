package problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees implements Iterable{
	private List<Employee> employees = null;
	
	public Employees(){
		employees = new ArrayList<>();
		employees.add(new Employee(1, "Ketki", 10000, "Lead"));
		employees.add(new Employee(2, "Anu", 100000, "SeniorLead"));
		employees.add(new Employee(3, "Junk", 20000, "LeadJunk"));
	}
	
	
	public Iterator<Employee> iterator(){
		return employees.iterator();
	}
}
