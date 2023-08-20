package copyarray;

import java.util.Scanner;

public class CopyArray {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("eneter the array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("array 1 elements are ");
	for(int i=0;i<arr.length;i++) 
	{
	
		System.out.print(arr[i]+" ");
		
	}
	int newarr[]=new int[arr.length];
	System.out.println("new array copied from old array ");
	for(int i=0;i<arr.length;i++) 
	{
		newarr[i]=arr[i];
		System.out.print(newarr[i]+" ");
		
	}
	
	
}
}
