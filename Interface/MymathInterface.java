package Interface;

interface MymathInterface {
	int no1=10,no2=20;
	void add(int a, int b);
	default void sub()
	{
		System.out.println("--Implemented method in i/f");
	}
	
	default double sqrt(double no)
	{
	System.out.println("sqrt Method must be default");
	return 0;
	}
	static void multi()
	 {
		 System.out.println("---static method----");
	 }
}

class Mymath implements MymathInterface
{

	@Override
	public void add(int a, int b)
	{
		System.out.println("A+B="+(a+b));
	}
	
	@Override 
	public void sub()
	{
		System.out.println("We can Override sub also");
	}
	
}
