package Halvethenumber;

import java.util.Scanner;

public class HavleIt {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number ");
	int num =scan.nextInt();
	System.out.println("half of the given number is "+halvenumis(num));
}
public static double halvenumis(int num)
{
	return num/2.0;
}
}
