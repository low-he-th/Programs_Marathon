package agecategorizer;

import java.util.Scanner;

public class AgeCategorizer {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the age");
	int age =scan.nextInt();
	cheakAge(age);
	scan.close();
}
public static void cheakAge(int age)
{
	if(age<=12)
	{
		System.out.println("your child");
	}
	else if(age>=13&&age<=19)
	{
		System.out.println("your are teen");
	}
	else if(age>=20&&age<=59)
	{
		System.out.println("your are adult");
	}
	else
	{
		System.out.println("you  are senior ceitzen");
	}
}
}
