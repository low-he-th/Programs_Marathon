package pattern.level6;

public class Pattern16 {
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
	System.out.print("   ");
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
}
}
