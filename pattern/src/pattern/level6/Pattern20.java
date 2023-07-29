package pattern.level6;

public class Pattern20 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
	for(int k=i;k<=5;k++) {
		System.out.print(k+" ");
	}
	System.out.println();
	}
	for(int i=5-1;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
