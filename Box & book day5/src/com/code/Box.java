package com.code;

public class Box {
	private int lenght,hight,width;
	
	
	public Box()
	{
		System.out.println("default constructor call");
		this.hight = 10;
		this.width = 10;
		this.lenght = 10;
	}

	public Box(int lenght, int hight, int width) {
		System.out.println("---parameter constructor int int int---");
		this.lenght = lenght;
		this.hight = hight;
		this.width = width;
	}
	
	public Box(int side) {
		this.hight = side;
		this.lenght=side;
		this.width=side;
	}
	
	public String toString()
	{
		return "Box height=" + hight + ", width=" + width + ", length=" + lenght;
	}
	
	public boolean isSame(Box Obj)
	{
		if(this.hight==Obj.hight && this.width==Obj.width && this.lenght==Obj.lenght) {
			return true;
		}
		else 
			return false;
	}
}
