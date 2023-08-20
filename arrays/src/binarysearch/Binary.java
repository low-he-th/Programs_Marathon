package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
public static  void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int  arr[]=new int[scan.nextInt()];
	System.out.println("enetr the array elemnts ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("enter the key to be searched ");
	int key =scan.nextInt();
	Searching s=new Searching();
	 int res=s.Binary(arr, key);
	if(res==-1) {
		System.out.println("key not found");
	}
	else {
		System.out.println("key found at index "+res);
	}
	//System.out.println("key not found ");
//	int target=scan.nextInt();
//	Arrays.sort(arr);
//	int index=Arrays.binarySearch(arr,target);
//	if(index>=0) {
//		System.out.println(index);
//	}
}
}
