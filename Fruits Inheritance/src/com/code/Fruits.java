package com.code;

public abstract class Fruits {
	
	private String name, color;
	private double weight,price;
	
	
	
	public Fruits() {
		super();
		name="no name";
		color="no colour";
		price=0;
		weight=0;
	}

	public Fruits(String name, String color, double weight, double price) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.price = price;
	}
	
	public abstract void teste();
	
	public String toString()
	{
		return "name=" + name + ", color=" + color + ", weight=" + 
	weight + ", price=" + price ;
	}


	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}
