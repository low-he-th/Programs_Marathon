package merge;

public class Merging {
public int[] logic(int arr1[],int arr2[])
{
	int arr3[]=new int[arr1.length+arr2.length];
	
	for(int i=0;i<arr1.length;i++) 
	{
		arr3[i]=arr1[i];
	}
	

	for(int i=0;i<arr2.length;i++)
	{
		arr3[arr1.length+i]=arr2[i];
	}
	
      return arr3;
}
}
