package practice;

public class Pratice {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int result=sumArray(arr,0,arr.length-1);
	System.out.println(result);
}
public static int sumArray(int []arr,int start,int end) 
{
	if(start==end) {
		return arr[start];
	}
	else {
		int mid=(start+end)/2;
		int leftSum=sumArray(arr,start,mid);
		int rightSum=sumArray(arr, mid+1, end);
		return leftSum+rightSum;
	}
}
}
