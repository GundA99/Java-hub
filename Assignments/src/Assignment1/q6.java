package Assignment1;
import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		int no1, no2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no1 : ");
		no1 = sc.nextInt();
		System.out.print("Enter the no2 : ");
		no2 = sc.nextInt();
		int gcd = 0;
		for (int i = 2; i < (no1 | no2); i++) {
			if (no1 % i == 0 && no2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("GDC of " + no1 + " and " + no2 + " = " + gcd);
	}
}
