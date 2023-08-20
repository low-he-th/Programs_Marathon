package arrays;

import java.util.Scanner;

public class ArraySwapping {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array lenght");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elements");
	for( int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
		
	}
	for(int x:arr) {
		System.out.print(x+" ");
	}
	
	System.out.println("enter the two indexs for swapping");
	int x=scan.nextInt();
	int y=scan.nextInt();
	System.out.print("enetered index values are "+x+" "+y);
	int z=arr[x];
	arr[x]=arr[y];
	arr[y]=z;
	System.out.println();
	for(int newarr:arr) {
		System.out.print(newarr+" ");
	}
}
}
