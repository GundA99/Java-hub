package Assignment1;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int no;
		System.out.print("Enter the no : ");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		int sum=1;
		for (int i = 1; i <= no; i++) {
			sum = sum*i;
		}
		System.out.print(sum);
	}
}
