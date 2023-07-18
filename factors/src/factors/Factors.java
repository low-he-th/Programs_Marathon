package factors;

import java.util.Scanner;

public class Factors {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number ");
	int n=scan.nextInt();
	for (int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println("the factors of the given number are  "+i);
		}
	}
	scan.close();
}
}

