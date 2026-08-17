package oops;

public class Method_hiding {

	public static void main(String[] args) {
		
		Prince p = new Prince();
		p.rule();
		p.tax();
		p.fight();
		

	}

}
class King
{

	public void rule()
	{
		System.out.println("Rule By the king");
	}
	public void tax()
	{
		System.out.println("Tax is 1/3 of production");
	}
	public static void fight()
	{
		System.out.println("War is Started by King");
	}
}

class Prince extends King
{

	public void rule()
	{
		System.out.println("Rule by the Prince");
	}
	public void tax()
	{
		System.out.println("Tax is 1/4 of Production");
	}
	public static void fight()
	{
		System.out.println("War is started by the Prince");
	}
}



