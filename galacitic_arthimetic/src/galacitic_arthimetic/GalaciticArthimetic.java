package galacitic_arthimetic;
import java.util.Scanner;

public class GalaciticArthimetic {
public static void main(String[] args) {
try (Scanner scan = new Scanner (System.in)) {
	System.out.println("enter num1");
	long num1=scan.nextLong();
	System.out.println("enter num2");
	long num2=scan.nextLong();
	System.out.println(galacticAddition(num1, num2));
}
}
   public static long  galacticAddition(long num1, long num2) {
	   return num1+num2;
}
}


