package problems;

public class Employee {

	private int empid;
	private String empName;
	private double empSal;
	private String empDesignation;
	
	public Employee(int empid, String ename, double empSal, String designation){
		this.empid = empid;
		this.empName = ename;
		this.empSal = empSal;
		this.empDesignation = designation;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	
	
}
