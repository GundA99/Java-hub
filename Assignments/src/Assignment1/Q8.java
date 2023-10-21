package Assignment1;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		int no,flag;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no : ");
		no = sc.nextInt();
		System.out.print("Prime no : ");
		for (int i = 2; i < no; i++) {
			flag=0;
			for (int j = 2; j < i; j++) {
				if(i%j==0)
				{
					flag = 1;
				}
			}
			if(flag != 1)
			{
				System.out.print(i+", ");
			}
		}
	}
}
