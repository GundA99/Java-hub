package Tests;

public class Test5 {
	public static void main(String[] args) {

		try {
			testMe("12345");
			System.out.println("end of try in main");
		} catch (Exception e) {
			System.out.println("in main's catch-all");
			System.out.println(e);// toString
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("main over....");

		
	}
	
	static void testMe(String s) throws InterruptedException
	{
		System.out.println("in testMe");
		try {
			System.out.println("Parsed int value "+Integer.parseInt(s));
			Thread.sleep(1000);
			System.out.println("---");
			boolean flag = true;
			if(flag)
				System.exit(-1);
		}
		finally {
			System.out.println("In method finally");
		}
		System.out.println("End of Method");
	}

}
