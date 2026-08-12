package oops;

public class Polymorphism {

	public static void main(String[] args) {
		

		Father f = new Son();
		f.land();
		f.farming();
		
	}

}
class Father
{
	public void farming()
	{
		System.out.println("Traditional Farming");
	}
	public void land()
	{
		System.out.println("70 Acers of Land");
	}
}
class Son extends Father
{

	public void land()
	{
		
		System.out.println("20 Acers of Land");
	}
}