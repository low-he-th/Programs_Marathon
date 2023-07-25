package findgcd;

import java.util.Scanner;

public class GCDapp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println(" enter the numbers");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	GcD gcd=new GcD();
	int res =gcd.findgcd(num1, num2);
	System.out.println("Gcd of "+num1+" and "+num2+" is "+res);
	scan.close();
}
}
