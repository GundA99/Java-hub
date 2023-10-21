package Assignment1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		int x,n,s=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X :");
		x = sc.nextInt();
		System.out.print("Enter n :");
		n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			s = s*x;
		}
		System.out.println(x+"^"+n+" = "+s);
		

	}

}
