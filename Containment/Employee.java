
public class Employee {

	private int empno;
	private String name,city;
	private Date dob;
	
	
	
	public Employee() {
		super();
		this.empno = 101;
		this.name = "Akash";
		this.city = "Solapur";
		this.dob = new Date();
	}



	public Employee(int empno, String name, String city, Date dt) {
		super();
		this.empno = empno;
		this.name = name;
		this.city = city;
		this.dob = dt;
	}
	

public String toString() {
	return "Employee :"+empno+"   Name:"+name+"   City:"+city  +"  DOB:"+dob;
}

	
}
