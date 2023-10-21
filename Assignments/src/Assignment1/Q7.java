package Assignment1;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Compute area of circle\n2: Compute area of rectangle"
				+ "\n3 : Compute area of triangle\n4 : Exit");
		do {
			System.out.println("---------------------------");
			System.out.println("Enter choise : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				int r;
				System.out.print("Enter redius of circle :  ");
				r = sc.nextInt();
				System.out.println("area of circle : "+(float)(3.14*r+r));				
				break;
			case 2:
				int l,b;
				System.out.print("Enter lenght :  ");
				l = sc.nextInt();
				System.out.print("Enter breadth :  ");
				b = sc.nextInt();
				System.out.println("area of rectangle : "+(float)(l*b));				
				break;
			case 3:
				int b1,h;
				System.out.print("Enter hight :  ");
				h = sc.nextInt();
				System.out.print("Enter base :  ");
				b1 = sc.nextInt();
				System.out.println("area of tringle : "+(float)((b1*h)/2));				
				break;
			case 4:
				
				System.out.println("Thank you.....");				
				break;

			default:
				System.out.println("Enter valid choise ");
				break;
			}
			
		} while (ch!=4);
	}
}
