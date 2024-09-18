class Vehicle{
	void start(){
	System.out.println("Vehicle started");
	}
} 
class Car extends Vehicle{
	void start(){
	System.out.println("Car started");
	}
}
public class inheritance1{
	public static void main(String[]arg){
		Car c=new Car();
		super.start();
	}
}
