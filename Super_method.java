package This_Super;

public class Super_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Audi audi = new Audi();
		
		System.out.println(audi.price);
		
		audi.Stop();
	}

}
class Vehical
{
	int price = 200;
	
	public void Start()
	{
		System.out.println("Car is Starting...");
	}
}

class Audi extends Vehical
{
	
	public void Stop()
	{
		super.Start();
		System.out.println("Car is Stopped...");
	}
	}