package Selection;

import java.util.Scanner;

public class SearchingSorting {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=scan.nextInt();	
	}
	SearchingTechnique s=new SearchingTechnique();
	s.sorting(arr);
}
}
