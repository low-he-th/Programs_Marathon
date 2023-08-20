package ArrayMedian;

import java.util.Arrays;
import java.util.Scanner;

public class Arraymedian {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the array 1 length");
	int arr1[]=new int[scan.nextInt()];
	System.out.println("enter the array 1 elements");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=scan.nextInt();
	}
	System.out.println("enter the array 2 length");
	int arr2[]=new int[scan.nextInt()];
	System.out.println("enter the array 2 elements");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=scan.nextInt();
	}
	
	double res =ArrayMedianCalculate.Median(arr1, arr2);
	System.out.println("Median of given array is "+res);
	
}

}
