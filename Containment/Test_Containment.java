
import java.util.Scanner;
public class Test_Containment {

	public static void main(String[] args) {
		
		Date obj = new Date(1,05,1999);
		Employee obj1 = new Employee(201,"jayesh","jal",obj);
		
		System.out.println(obj);
		System.out.println(obj1);
		
		System.out.println("---------------------------");
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Id, Name, City, DD, MM, yy");
		Employee obj2 = new Employee(sc.nextInt(),sc.next(),sc.next(), new Date(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		System.out.println(obj2);
		

	}

}
