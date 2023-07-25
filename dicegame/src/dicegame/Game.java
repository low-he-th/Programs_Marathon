package dicegame;

import java.util.Random;

public class Game {
public static void main(String[] args) {
	Random r=new Random();
	int roll =6;
	System.out.println("rolling the dice "+roll+" times ");
	for (int i =1;i<=roll;i++)
	{
		int dicevalve=r.nextInt(6)+1;
		System.out.println("roll "+i+":"+"dicevalve "+dicevalve);
	}
}
}
