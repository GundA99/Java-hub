package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println("1:Show Array\r\n" + 
				"2:Add element\r\n" + 
				"3:search element\r\n" + 
				"4:doubleArrayElement\r\n" + 
				"5:sortArray");
		int ch, index = 0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter choise : ");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			
			for (int num : arr) {
				System.out.print(num+"  ");
			}
			System.out.println();

			break;

		case 2:
			if(index<arr.length) {
			System.out.print("Enter the number : ");
			arr[index] = sc.nextInt();
			index++;
			}
			else 
				System.out.println("Array is full");
			break;
		
		case 3:
			System.out.print("Enter the no for search : ");
			int s = sc.nextInt();
			boolean a = false;
			for(int i =0; i<arr.length;i++)
			{
				if(arr[i]==s)
				{
					System.out.println("At index "+i);
					a=true;
				}
			}
			if(a==false)
			{
				System.out.println("Element not found ");
			}
		break;
		case 4:
			for(int no:arr)
			{
				System.out.print(no*2+"  ");
			}
			System.out.println();
			break;
			
		case 5:
			Arrays.sort(arr,0,arr.length);	
			for(int a1:arr)
			{
				System.out.print(a1+"  ");
			}
			System.out.println();
			break;
		case 6:
			System.out.println("----Exit-----");
		}
		}while(ch!=6);
		

	}
}
