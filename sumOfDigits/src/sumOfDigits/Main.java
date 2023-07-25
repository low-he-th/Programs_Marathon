package sumOfDigits;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	System.out.println("sum of digits in given number is "+SumOfDigits.calculateSumOfDigits(num));
	scan.close();
}
}
