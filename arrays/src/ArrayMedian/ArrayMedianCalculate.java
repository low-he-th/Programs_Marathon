package ArrayMedian;

import java.util.Arrays;

public class ArrayMedianCalculate {
	public static double Median(int arr1[],int arr2[])
	{
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		Arrays.sort(arr3);

		if(arr3.length%2==0) {
			int m1=arr3[(arr3.length/2)-1];
			int m2=arr3[arr3.length/2];
			return (double)(m1+m2)/2;
		}
		
		return (double)arr3[arr3.length/2];
		
	}
}
