package arraymerge;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the length of 1st array");
	int arr1[]=new int [scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=scan.nextInt();
	}
	System.out.println("enter the length of 2nd array");
	int arr2[]=new int [scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=scan.nextInt();
	}	
	
	 Logic logic=new Logic();
	 int res[]=logic.SumOfArray(arr1, arr2);
	 System.out.println("sum of two arrays in third array ");
	 for(int x:res) {
		 System.out.print(x+" ");
	 }
}
}
