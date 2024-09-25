class vehicle{
	vehicle(){
		System.out.println("This is a vehicle");
	}
}
class fourwheeler extends vehicle{
	fourwheeler(){
		System.out.println("This  is a fourwheeler");
	}
}
class car extends fourwheeler{
	car(){
		System.out.println("This is a car");
	}
}
 public class multiInheritance_constructor{
 	public static void main(String[] args){
 		vehicle v=new vehicle();
 		fourwheeler f=new fourwheeler();
 		car c=new car();
 	}
 }
