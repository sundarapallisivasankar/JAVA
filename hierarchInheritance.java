class Shape{
	double getArea(){
	return 0;
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(double length,double width){
	this.length=length;
	this.width=width;
	}
	double Area(){
		return length*width;
		
	}
}

class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double CArea(){
		return Math.PI*radius*radius;
	}
}

public class hierarchInheritance{
	public static void main(String[] args){
		Rectangle rect=new Rectangle(5,3);
		Circle c=new Circle(4);
		Shape s=new Shape();
		System.out.println("Area of rectangle: "+rect.Area());
		System.out.println("Area of circle: "+c.CArea());
		System.out.println("Area of Shape: "+s.getArea());
	}
}


