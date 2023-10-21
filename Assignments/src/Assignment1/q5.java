package Assignment1;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		int no;
		System.out.print("Enter the no : ");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		System.out.print("Factor of "+no+" = ");
		for(int i = 2; i<no; i++)
		{
			if(no%i==0)
			{
				System.out.print(i+", ");
			}
		}
	}

}
