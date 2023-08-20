package copyarray;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrays {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the array lenght");
	
	String arr[]=new String[scan.nextInt()];
	System.out.println("enter the array elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.next();
	}
	System.out.println("original array is ");
	for(String x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
    System.out.println("copied array");
    String newarr[]=Arrays.copyOf(arr,arr.length);
    //String newarr[]=new String[arr.length];
	System.arraycopy(arr,0, newarr,0 , arr.length);
	for(String x:newarr)
	{
		System.out.print(x+" ");
	}
	//comparing arrays
	System.out.println();
	boolean isequals=Arrays.equals(arr, newarr);
	System.out.println("both arrays are equal -"+ isequals);
}
}
