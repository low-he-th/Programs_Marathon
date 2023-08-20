package arrays;

import java.util.Scanner;

public class Program3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=scan.nextInt();
    	
    }
    for(int a:arr)
    {
    	if(a>=0) {
    		System.out.println(a+ " is positive");
    	}
    }
    scan.close();
	
}
}
