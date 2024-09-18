class Animal{
	void makeSound(){
		System.out.println("shout");
	}
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("Bow");
	}
}

class Puppy extends Dog{
	void makeSound(){
		System.out.println("Yak");
	}
}
public class multiInheritance{
	public static void main(String[]args){
		Puppy p=new Puppy();
		Animal a=new Animal();
		Dog d=new Dog();
		a.makeSound();
		d.makeSound();
		p.makeSound();
	}
}
