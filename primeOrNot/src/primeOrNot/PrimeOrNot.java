package primeOrNot;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();

	if(n<2)
	{
		System.out.println("the number is not prime");
	}
	for(int i=2;n<i*i;i++)
	{
		if(n%i==0) {
		System.out.println("the number is not prime ");
	}else {
		System.out.println("number is prime");
	}
}
}
}
	


	
