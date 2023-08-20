package insertionSort;

import java.util.Scanner;

public class Insertion {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++) 
	{
		arr[i]=scan.nextInt();
	}
	InsertionTechnique s=new InsertionTechnique();
	s.sorting(arr);
}
}
