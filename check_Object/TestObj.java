package TestObject;

public class TestObj {

	public static void main(String[] args) {
		
		Date d1 = new Date(11, 12, 1981);
		System.out.println(d1);

		Date d2 = new Date(11, 11, 1981);
		System.out.println(d2);
		
		if(d1==d2)
		{
			System.out.println("d1==d2");
		} else {
			System.out.println("d1!=d2");
		}
		
		Date d3;
		d3 = d2;
		
		if(d3==d1)
		{
			System.out.println("d1==d2");
		} else {
			System.out.println("d1!=d2");
		}
		System.out.println("--------------------");
		
		if(d1.equals(d2))
		{
			System.out.println("d1 equal d2");
		} else {
			System.out.println("d1 not equal d2");
		}
		
		Date dob1 = new Date(2, 2, 2022);
		Date dob2 = new Date(2, 2, 2022);
		
		if(dob1.equals(dob2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
