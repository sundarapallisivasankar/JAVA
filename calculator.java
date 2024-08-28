import java.util.Scanner;
public class calculator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int a=sc.nextInt();
		System.out.println("Enter the second value: ");
		int b=sc.nextInt();
		System.out.print("Enter your choice: \n1.sum\n2.difference\n3.mutiplication\n4.quotient\n5.remainder\n");
		int c=sc.nextInt();
		switch(c)
		{
		 	case 1:System.out.print("sum: "+(a+b));
		 			break;
		 	case 2:System.out.print("difference: "+(a-b));
		 			break;
		 	case 3:System.out.print("product: "+(a*b));
		 			break;
		 	case 4:System.out.print("quotient: "+(a/b));
			 		break;
		 	case 5:System.out.print("remainder: "+(a%b));
		 			break;
			default:System.out.print("Enter valid operation");
	
		}	
	}
}
