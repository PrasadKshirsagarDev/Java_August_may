package This_Super;

public class Cons_Jumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aeroplane aero = new Aeroplane();
		

	}

}
class Aeroplane{
	
	
	// ADCB
//	public Aeroplane()
//	{
//		System.out.println("A");
//	}
//	
//	public Aeroplane(int i)
//	{
//		this("A");
//		System.out.println("B");
//	}
//	
//	public Aeroplane(String a)
//	{
//		this(1.25);
//		System.out.println("C");
//	}
//	
//	public Aeroplane(Double d)
//	{
//		this();
//		System.out.println("D");
//	}
	
	
	//BDAC
//	public Aeroplane()
//	{
//		this(1.5);
//		System.out.println("A");
//	}
//	
//	public Aeroplane(int i)
//	{
//		System.out.println("B");
//	}
//	
//	public Aeroplane(String S)
//	{
//		this();
//		System.out.println("C");
//	}
//	
//	public Aeroplane(Double d)
//	{
//		this(25);
//		System.out.println("D");
//	}
	
	//DCBA
	public Aeroplane()
	{
		this(2);
		System.out.println("A");
	}
	
	public Aeroplane(int i)
	{
		this("s");
		System.out.println("B");
	}
	
	public Aeroplane(String S)
	{
		this(2.3);
		System.out.println("C");
	}
	
	public Aeroplane(Double d)
	{
		
		System.out.println("D");
	}
	
	
}