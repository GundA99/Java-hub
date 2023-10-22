package com.code;

public class mango extends Fruits {
	
	public mango(String name,String color,double w,double p)
	{
		super(name,color,w,p);
	}
	
	@Override
	public void teste()
	{
		System.out.println(" Mango taste is Sweet");
	}
	public void pulp()
	{
		System.out.println("mngo pulp ");
	}
	
	public String toString()
	{
		return "Mango"+super.toString();
	}
}
