package merge;
/*Merge elements of 2 arrays into a 3rd array:

Problem: We have two arrays, and we want to combine them into a third array.

Approach: We will create a third array that has a size equal to the sum of the sizes of the first two arrays. We'll then copy all elements from the first array to the third array, and then continue where we left off by copying all elements from the second array to the third array.*/
import java.util.Scanner;

public class Merge {
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
	
	Merging m=new Merging();
	int res[] =m.logic(arr1, arr2);
	System.out.println("merged array is ");
	for(int x:res) {
		System.out.print(x+" ");
	}
}
}
