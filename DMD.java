package oops;


public class DMD {

	public static void main(String[] args) {
		
		Father1 f = new Daughter();
		
				f.Farming();
	}

}
class Father1
{
	public void Farming()
	{
		System.out.println("Traditional Farming by father");
	}
	
	public void Seeds()
	{
		System.out.println("Using the traditional Seeds");
	}
	}
class Daughter extends Father1
{
	
	public void Farming()
	{
		System.out.println("Modern Farming by Daughter");
	}
	}



