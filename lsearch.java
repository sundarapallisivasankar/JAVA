import java.util.Scanner;
public class lsearch{
	public static int lsearch(int[] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;	
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n]; 
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key value");
		int key=sc.nextInt();

		int result=lsearch(a,key);
		if(result==-1){
			System.out.println("Key not found");
		}
		else{
			System.out.println("key" + key+"found at index:"+result);
		}
	}
}
