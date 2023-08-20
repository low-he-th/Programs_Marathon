package TwoSum;

import java.util.Scanner;

public class TwoSUM {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the array lenght");
int arr[]=	new int[scanner.nextInt()];
System.out.println("enter the array elements");
for(int i=0;i<arr.length;i++)
{
	arr[i]=scanner.nextInt();
}
System.out.println("enter the target");
int target =scanner.nextInt();
int res[]=ArrayTwoSum.twosum(arr, target);
for(int x:res) {
	System.out.println("sum of these indices gives target "+x+" ");
}
}
}
