package Arrayreverse;

import java.util.Scanner;

public class ArrayMain {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println(" eneter the array elemenst");
	PrintArray logic=new PrintArray();
	for(int i=0;i<arr.length;i++) 
	{
		arr[i]=scan.nextInt();
	}
	logic.printArray(arr);
	
	
}
}
