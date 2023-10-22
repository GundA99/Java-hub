package com.peyroll;

public class Trainer extends employee{
	
	private String techname;
	private String batchname;
	
	
	public Trainer() {
		super();
		this.techname = "C++";
		this.batchname = "Sep23";
	}


	public Trainer(int empid, String name, double salary, String techname, String batchname) {
		super(empid, name, salary);
		this.techname = techname;
		this.batchname = batchname;
	}
	
	public void teaching()
	{
		System.out.println("Teaching....");
	}
	@Override
	public void calsalary() {
		System.out.println("calculating Trainer salary : "+(super.salary));
	}
	
	public String toString()
	{
		return super.toString()+" tech :"+techname+" batch :"+batchname;
		
	}
	  
}
