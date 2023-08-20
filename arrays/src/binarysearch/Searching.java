 package binarysearch;

public class Searching {
public int  Binary(int arr[],int key) {
	int low=0;
	int high=arr.length;
	
	while(low<=high) {
		int mid=(low+high)/2;
	if(key==arr[mid])
	{
		//System.out.println(" key found at index "+mid);
		return mid ;
	}
	else if(key>arr[mid])
	{
		low=mid+1;
	
	}
	else if(key<arr[mid])
	{
		high=mid-1;
		
	}
	}
	return -1;
	//System.out.println("key not found");
}
}
