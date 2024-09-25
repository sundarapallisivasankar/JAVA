class person {
	String  name;
	int age;
	person(String name,int age)	{
		this.name=name;
		this.age=age;
	}
	void display(){
		System.out.println("Name:"+name +" "+"Age: "+age);
	}	
}
class employee extends person{
	double  sal;
	employee(String name,int age,double sal){
		super(name,age);
		this.sal=sal;
	}
	void display(){
		System.out.println("Name: "+name+" "+"Age: "+age+" "+"Sal: "+sal);
	}
}
public class superkey{
	public static void main(String[] args){
		person p=new person("Surya",19);
		employee emp=new employee("Bhai",20,55000);
		p.display();
		emp.display();
	}
}
