package factorial;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
Scanner scan=new	Scanner(System.in);
	int i=1;
	int factorial =1;
	System.out.println("enter the number");
	int n =scan.nextInt();
	while(i<=n) 
	{
		factorial=factorial*i;
		
		i++;
	}
	System.out.println("factorial of  given number is"+ (factorial));
	scan.close();
}
}
