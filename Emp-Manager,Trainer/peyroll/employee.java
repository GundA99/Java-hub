package com.peyroll;

public class employee {
	private int empid;
	private String name;
	protected double salary;
	
	employee()
	{
		super();
		empid=101;
		name="default_name";
		salary=501;
	}

	public employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void calsalary()
	{
		System.out.println("Salary calculating : "+salary);
	}
	
	public String toString()
	{
		return "empid : "+empid+"  name : "+name+"  salary :"+salary;
	}
	
}
