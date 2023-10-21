package com.code;

import java.util.Scanner;

public class TestFruit {
	
	public static void main(String[] args) {
		System.out.println("1: Show Fruit basket \n2: Add mango "
				+ "\n3: Add Apple \n4:Add Orenge \n5:Total 6:Exit");
		Fruits[] fruitBasket = new Fruits[10];
		
		Scanner sc = new Scanner(System.in);
		int ch ,index=0;
		double total=0;
		
		do {
			System.out.println("Enter valid choise : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				for(Fruits f:fruitBasket)
				{
					if(f!=null)
					{
					System.out.println(f);
					f.teste();				
					}
					else
					System.out.println("Empty basket ");
				}
				break;
				
			case 2:
				if(index<fruitBasket.length)
				{
				System.out.println("Enter name, color, wight, price");
				fruitBasket[index] = new mango(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
				System.out.println("mango is added...");
				index++;
				}
				else {
				System.out.println("Basket is full...");
				}
			break;
			
			case 3:
				if(index<fruitBasket.length)
				{
					System.out.println("Enter name, color, wight, price");
					fruitBasket[index] = new Apple(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
					System.out.println("Apple is added...");
					index++;					
				}
				else
				{
					System.out.println("basket is full...");
				}
				break;				
			case 4:
				if (index<fruitBasket.length)
				{
					System.out.println("Enter name, color, wight, price");
					fruitBasket[index] = new orenge(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
					index++;
					System.out.println("Orenge is added");
				}
				else
				{
					System.out.println("Basket is full");
				}
				break;
				
			case 5:
				for(Fruits f1:fruitBasket)
				{
					if(f1!=null)
					{
					total=total+f1.getPrice();
					}
				}
				System.out.println("Total Price :" + total);				
			}
			
		}while(ch!=6);
		
		
		
		
	}		
}
