package bubblesort;

import java.util.Scanner;
 
public class BubbleSort {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the array lenght");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("array elemnets before sorting ");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	Sort sort=new Sort();
	sort.sorting(arr);
	
}
}

