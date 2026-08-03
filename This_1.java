package This_Super;

public class This_1 {

	public static void main(String[] args) {
		
		Truck T = new Truck();
		
		//C
		//B
		//A

		
	}

}
class Truck{
	
	public Truck()
	{
		this(2);
		System.out.println("A");
	}
	
	public Truck(int i)
	{
		this("Prasad");
		System.out.println("B");
	}
	
	public Truck(String a)
	{
	
		System.out.println("c");
	}
}