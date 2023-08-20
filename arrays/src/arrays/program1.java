package arrays;

import java.util.Scanner;

public class program1 {
public static void main(String[] args) {
	Scanner  scan=new Scanner(System.in);
	System.out.println("enter the length of array");
	int arr[]=new int [scan.nextInt()];
	System.out.println("enter "+arr.length+" the array contents");
	for(int i=0;i<arr.length;i++)
	{
arr[i]=scan.nextInt();

	}
	System.out.println("array contents are ");
	for(int j=0;j<arr.length;j++) {
		System.out.print(arr[j]+" ");
	}
}
}
