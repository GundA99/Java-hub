package Assignment1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		int no,sum=0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.print("Enter the number : ");
		no=sc.nextInt();
		sum = sum+no;
		}
		while(no>=0);
		System.out.println("Sum = "+sum);

	}

}
