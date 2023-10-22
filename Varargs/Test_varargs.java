package lab2;


public class Test_varargs {
	public static void main(String[] args) {
		MathOperation obj = new MathOperation();
		System.out.println(obj.add(40,50));
		System.out.println(obj.add(40,50,60,40,10));
		System.out.println(obj.add(10,20,30.2));
	}
}
