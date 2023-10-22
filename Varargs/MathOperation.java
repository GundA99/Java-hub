package lab2;

public class MathOperation {

	public int add(int a, int b)
	{
		System.out.println("I am From Add(A,B)");
		return a+b;
	}
	public int add(int... a)

	{
		System.out.println("I am from int");
		int c = 0;
		for (int no : a) 
		{
			c = c + no;
		}
		return c;

	}
	
	public double add(double...a) {
		System.out.println("I am from double");
		double b=0;
		for(double e:a)
		{
			b=b+e;
		}
		return b;
			
	}
}
