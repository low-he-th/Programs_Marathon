package fibonici;

import java.util.Scanner;

public class logic {
	public static void logichere() {
		
	Scanner scan =new Scanner(System.in);
	int n=scan.nextInt();
	int fib0=0;
	int fib1=1;
	
	if (n==0) {
		System.out.print(fib0);
		
	}
	else if(n==1)
	{
		System.out.print(fib0+" "+fib1+" ");
	}
	else {
	System.out.print(fib0+" "+fib1+" ");
	for (int i=3;i<=n;i++) {
		int nextno=fib0+fib1;
		fib0=fib1;
		fib1=nextno;
		System.out.print(nextno+" ");
	}
	}
scan.close();
}
}
