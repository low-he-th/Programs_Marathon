package samekey;

public class KeySearch {
public static void main(String[] args) {
	int arr[]= {1,2,5,5,5};
	for(int i=0;i<=arr.length-1;i++)
	{
	if(arr[i]==arr[i+1])
	{
		System.out.println("same key present at index "+i);
	}
	
	}
		System.out.println("no key prsent");
			
}
}
