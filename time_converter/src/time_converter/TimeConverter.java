package time_converter;

import java.util.Scanner;

public class TimeConverter {
public static void main(String[] args) {
Scanner  scan =new	Scanner(System.in);
System.out.println("enter the time in  min");
int min=scan.nextInt();
   System.out.printf("%.2f", mintohour(min));
}
public static double mintohour(int min)
{
return min/60.0;
	
}
}
