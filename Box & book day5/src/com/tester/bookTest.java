package com.tester;

import com.code.book;

public class bookTest {

	public static void main(String[] args) {
		
		book obj,obj2;
		obj = new book("java",500);
		obj2 = new book("c++",600);
		System.out.println(obj);
		System.out.println(obj2);
		
		for(int i=0;i<5;i++)
		{
			book obj1 = new book("bookname",1254);
			System.out.println(obj1);
		}

	}

}
