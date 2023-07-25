package discount;

import java.util.Scanner;

public class Discount {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in)	;
System.out.println("eneter the amount ");
double amnt=scan.nextDouble();
discount(amnt);
scan.close();
}
public static void discount(double amnt) {
	if(amnt>100)
	{
	System.out.println("discount applicable ");
	}else
		System.out.println("discount not applicable ");
	
}
}