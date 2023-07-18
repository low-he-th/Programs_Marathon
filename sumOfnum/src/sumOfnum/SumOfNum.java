package sumOfnum;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
	System.out.println("enter the number ");
		int n=scan.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			
		}
		System.out.println(sum);
		scan.close();
	}
}
