package cheakprime;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	cheakPrime c=new cheakPrime();
	int num=scan.nextInt();
	int count =0;
	for (int i=3;i<num;i++)
	{
		int res =c.cheakingPrime(i);
		if (res!=0)
		{
			System.out.println(res);
			count++;
		}
	}
	System.out.println(" total  prime numbers are "+count);
	scan.close();
}
}
//NOTE:
/*if the method is static and present in different class ,then
 * we call the method by class name.method name EX:cheakPrime.cheakingPrime().
 * 
 * if the  method is non static and present in different class then,
 * we call it by creating object for the class and then for object reference.method name.
 * ex:object  o=new object();
 * o.methodname ();*/ 
 

