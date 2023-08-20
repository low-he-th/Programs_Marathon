package arrayreplace;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the length of 1st array");
	int arr[]=new int [scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int x:arr) {
		System.out.println(x+" ");
	}
	Logic l=new Logic();
	l.RepalceByZero(arr);
	System.out.println("replaced array ");
  for(int x:arr) {
	  System.out.print(x+" ");
  }
}
}

