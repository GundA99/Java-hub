package Tests;

public class Test1 {

	public static void main(String[] args) {

		try {
			String names[] = { "One", "Two", "Three" };
			System.out.println(names[2]);
			System.out.println("parsed int "+Integer.parseInt("1234"));
			
			
			int a = 10;
			int b = 0;
			System.out.println("div "+(a/b));
			System.out.println("End of try");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("am from ArrayIndexOutOfBoundsException !!");
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		catch(NumberFormatException f)
		{
			System.out.println("Hi am from NumberFormatException !!");
			System.out.println("Error : "+f.getMessage());
			System.out.println(f);
		}
		catch(ArithmeticException a)
		{
			a.printStackTrace();
			System.out.println("Hi am from ArithmeticException");
		}
		catch(Exception e)
		{
			System.out.println("in catch-all");
			System.out.println("err mesg " + e.getMessage());
			System.out.println("exc toString " + e);
			System.out.println("---------------");
			e.printStackTrace();
		}
		System.out.println("Main continue ...");
		
	}
	

}
