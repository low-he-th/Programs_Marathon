package sumOfseries;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number ");
	double n=scan.nextDouble();
	System.out.println(SumofSeries.logic(n));
	scan.close();
}
}
