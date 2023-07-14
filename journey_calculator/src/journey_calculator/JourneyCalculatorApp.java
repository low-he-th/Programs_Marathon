package journey_calculator;

import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter the speed");
		double speed =scan.nextDouble();
		System.out.println("eneter the time");
		double time=scan.nextDouble();
		JourneyCalculator jc=new JourneyCalculator();
		System.out.println(jc.calculateDistance(speed,time));
	}

}
