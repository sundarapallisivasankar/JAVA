import java.util.Scanner;
public class linearsearch{
	public static int linearsearch(int[] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;	
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] num={10,20,30,40,50,60};
		int key =40;
		int result=linearsearch(num,key);
		if(result==-1){
			System.out.println("Key not found");
		}
		else{
			System.out.println("key" + key+"found at index:"+result);
		}
	}
}
