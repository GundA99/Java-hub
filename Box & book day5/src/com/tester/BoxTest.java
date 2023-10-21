package com.tester;

import com.code.Box;

public class BoxTest {
	public static void main(String[] args) {
		Box obj = new Box();
		System.out.println(obj);
		Box obj1 = new Box(10,20,30);
		System.out.println(obj1);
		
		Box obj2 = new Box(50);
		System.out.println(obj2);
	}
}
