package arraylevel4;

import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("eneter the array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	int sum=0;
	for(int x:arr)
	{
		sum+=x;
	}
	System.out.println("sum of array elements are "+sum);
}
}
