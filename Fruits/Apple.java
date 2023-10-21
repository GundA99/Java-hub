package com.code;

public class Apple extends Fruits {
	@Override
	public void teste()
	{
		System.out.println("Apple Test Is Sweet ");
	}
	public Apple(String name,String color,double wight,double price)
	{
		super(name,color,wight,price);		
	}
	public String toString()
	{
		return "Apple :"+super.toString();
	}
	public void jam()
	{
		System.out.println("Apple Spacific : Jam");
	}

}
