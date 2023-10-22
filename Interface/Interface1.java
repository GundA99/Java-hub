package Interface;

interface Interface1 {
	void Display();
}


class MyInterface implements Interface1
{
	@Override
	public void Display() {
		System.out.println("I am from Provider class...");
	}
}