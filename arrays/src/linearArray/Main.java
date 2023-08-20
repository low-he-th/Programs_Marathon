package linearArray;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the lenght of array");
	
	 int arr[]=new int[scan.nextInt()];
	 System.out.println(" enter the array elements");
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 System.out.println("enter the target to be searched");
	 int target=scan.nextInt();
	 
	Target t=new Target();
	boolean res=t.isPresent(arr,target);
	if(res==true)
	{
		System.out.println(" target present ");
	} 
	else {
		System.out.println("target absent");
	}
	
	
}
}
