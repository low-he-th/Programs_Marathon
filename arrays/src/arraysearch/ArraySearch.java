package arraysearch;

import java.util.Scanner;

public record ArraySearch() {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the array length ");
	int arr[]=new int[scan.nextInt()];
	System.out.println("enter the array elemnets");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}

	System.out.println("enter the key to be searched");
	int key=scan.nextInt();
	
	int res=LinearSearch.search(arr,key);
	if(res>=0) {
		System.out.println("key found at index "+res);
	}
	else {
		System.out.println("key not found");
	}
}
}
