package Arrayreverse;

import java.util.Scanner;

public class PrintArray {
public  void printArray(int arr[])
{
	System.out.println(" forward array ");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("reversee array");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}
}
