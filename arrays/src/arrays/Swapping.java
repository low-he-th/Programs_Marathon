package arrays;

import java.util.Scanner;

public class Swapping {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter x value");
	int x=scan.nextInt();
	System.out.println("enter y value");
	int y=scan.nextInt();
	System.out.println("before swapping");
	System.out.println("x value is "+x+" "+" y value is "+y );
       int z=x;
           x=y;
           y=z;
           System.out.println("after swapping");
           System.out.println("x value is "+x+" "+"y value is "+y);
scan.close();
}
}
