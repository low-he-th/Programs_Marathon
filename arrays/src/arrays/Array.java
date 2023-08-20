package arrays;


import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("eneter the array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("eneter th earray contents");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
		
	}
	System.out.println("array contents are");
	for (int x:arr) {
		System.out.print(x+5+" ");
	}
}

}
