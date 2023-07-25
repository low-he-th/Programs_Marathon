package CharIdentify;

import java.util.Scanner;

public class CharIdentify {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	//char arr[] = {'a','e','i','u','o'};
	System.out.println("enter the charater");
	char ch =scan.next().charAt(0);
	charIdentify(ch);
	scan.close();
	
}
public static void charIdentify(char ch) {
	if (Character.isLowerCase(ch))
	{
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		System.out.println("eneterd character is lower case vowel ");
	}
	else
	{
		System.out.println("entered character is lower  case consonants");
	}
	}
	else if (Character.isUpperCase(ch))
	{
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println("entered character is uppercase vowel ");
		}
		else 
		{
			System.out.println("entered character is upper case consonant");
		}
	}
	else if(Character.isDigit(ch))
	{
		System.out.println("entered characeter is digit ");
	}
	else {
		System.out.println("it is a special character");
	}
}
}
 