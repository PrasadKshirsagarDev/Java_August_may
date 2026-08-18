package oops;

public class Abstraction {

	public static void main(String[] args) {
		
		Truck truck = new Bharatbenz();
		truck.start("This is Truck");

	}

}
abstract class Truck
{

	abstract public void start(String i);
	
}

class Bharatbenz extends Truck
{
	public void start(String i) {
		
		System.out.println("Truck is Started");
		System.out.println(i);
		System.out.println(i.toUpperCase());
		
	}
}