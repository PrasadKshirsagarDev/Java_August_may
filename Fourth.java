package This_Super;

public class Fourth {

	public static void main(String[] args) {
		
		 
		
	Katraj k = new Katraj();
	
			k.Three();	

	}

}
class Pune{
	
	public Pune()
	{
		System.out.println("This is constructor Call");
	}
	public Pune(int i) {
		System.out.println("This is Pramaterized Constructor");
	}
	public void one()
	{
		System.out.println("Pune is known as Home of Education");
	}
	public void two()
	{
		System.out.println("Pune is city of joy");
	}
	
}

class Katraj extends Pune{
	
	public Katraj()
	{
		super(9);
		System.out.println("Constructor of Child Class");
	}
	public void Three()
	{
		
		System.out.println("This method is Overriden from Katraj class");
	}
	
}