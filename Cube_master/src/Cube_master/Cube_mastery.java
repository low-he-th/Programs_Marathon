package Cube_master;

import java.util.Scanner;

public class Cube_mastery {
public static void main(String[] args) {
Scanner  scan=new 	Scanner(System.in);
System.out.println("enter the num ");
int num =scan.nextInt();
System.out.println("cube of given number is"+ numtocube(num));
}
public static int numtocube(int num) {
	return num*num*num;
	
}
}
