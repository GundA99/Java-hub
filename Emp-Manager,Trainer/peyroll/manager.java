package com.peyroll;

public class manager extends employee {
	private String deptname;
	private double insentive;
	
	public manager()
	{
		super();
		deptname = "default_manager";
		insentive = 1001;
	}
	
	public manager(int empid, String name,double salary,String deptname,double insentive)
	{
		super(empid,name,salary);
		this.deptname = deptname;
		this.insentive=insentive;
	}
	
	public void managerspfunc()
	{
		System.out.println("Task Done by manager ");
	}
	
	public void calsalary() {
		System.out.println("Calculating manager salary "+(super.salary+this.insentive));
	}
	
	public String toString()
	{
		return super.toString()+" deptname :"+deptname+" insentive : "+insentive;
	}

}
