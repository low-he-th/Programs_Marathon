package height_convereter;

import java.util.Scanner;

public class HeightConvertion {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the height in inches");
	double inches=scan.nextDouble();
	HeightConvertor hc= new HeightConvertor();
	System.out.println(hc.convertInchesToFeet(inches));
}
}
