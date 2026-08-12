package This_Super;

public class Super_Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son son = new Son();
		
	}

}
class Father
{
	public Father()
	{
		System.out.println("The first Constructor of Father");
	}
	public Father(int i)
	{
		System.out.println("The second Constructor of Father");
	}
	public Father(String s)
	{
		System.out.println("The Third Constructor of Father");
	}
}

class Son extends Father
{
	
	public Son()
	{
		super(90);
		System.out.println("The constructor of Son");
	}
}



