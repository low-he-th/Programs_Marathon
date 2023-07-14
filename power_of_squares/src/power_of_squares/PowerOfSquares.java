package power_of_squares;

import java.util.Scanner;

public class PowerOfSquares {
public static void main(String[] args) {	
Scanner scan=new 	Scanner(System.in);
System.out.println("enter the number ");
int num =scan.nextInt();
System.out.println(powerofsq(num));
}
public static int powerofsq(int num)
{
	return num*num;
}
}
