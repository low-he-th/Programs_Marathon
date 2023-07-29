package pattern.level6;

public class Pattern18 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i+5;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=1;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
	System.out.print("* * * * * *");
	System.out.println();
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=5+3;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=1;j++) {
			System.out.println("*");
		}
	}
	for(int i=1;i<=9;i++) {
		System.out.print("*");
	}
}
}
