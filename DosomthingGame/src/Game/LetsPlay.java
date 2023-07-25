package Game;

import java.util.Random;
import java.util.Scanner;

public class LetsPlay {
public static void main(String[] args) {
	Random random=new Random();
	Scanner scan = new Scanner(System.in);
	System.out.println("hey , can i tell you something 😀 ");
	String  tell =scan.next();
	boolean Dosomething =random.nextBoolean();
	if (tell.equals("ok"))
	{
	       if (Dosomething) 
	       {
	    	   System.out.println("eat 5 star Do nothing ");
	       }
	       else
	       {
	    	   System.out.println("you should do your work ");
		    
	       }
	}           
	else
	{
		System.out.println("ok then you go and sleep");
	}
scan.close();
}
}
