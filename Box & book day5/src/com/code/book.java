package com.code;
//bookid,name,price idcounter
public class book {

	private int bookid;
	private String name;
	private double price;
	
	public static int idcounter;
	static {
		System.out.println("---Book.class get loaded---");
		System.out.println("----static----");
		idcounter =1000;
	
	}
	public book() {
		System.out.println("default constructor call");
	}
	public book(String name, double price)
	{
		System.out.println("---book constr get called---");
		this.name=name;
		this.price=price;
		idcounter=idcounter+1;
		this.bookid= idcounter;
	}
	
	public String toString()
	{
		return bookid+"  "+name+"  "+price+"  ";
	}
	
	
	
}
