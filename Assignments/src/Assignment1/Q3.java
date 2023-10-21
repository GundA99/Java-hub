package Assignment1;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		char ch,ch1;
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter char : ");
		ch = sc.next().charAt(0);
		ch1=ch;
		System.out.print("Enter number : ");
		no = sc.nextInt();
		ch = (char) (ch+no);
		System.out.println(ch1+"+"+no+" = "+ch);
	}
}
