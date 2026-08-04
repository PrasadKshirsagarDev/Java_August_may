package This_Super;

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Skoda sk = new Skoda();
		System.out.println(sk.price);
		sk.addprice(200);
	
	}

}
class Car{
	
	int price = 100;
	
}
class Skoda extends Car
{
	
	public void addprice(int price2)
	{
		System.out.println(super.price+price2);
	}
}