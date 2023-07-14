package loops;

public class Evenloop{
	public static void main(String[] args) {
		for (int i=0;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.err.print("|*|");
			}
			System.err.println("*|");
			
		}
		
		{
	int a =0;
	while (a<=5)
	{
		int b=1;
		while(b<=a) {
			System.out.print("|*|");
			b++;
		}
		System.out.println("*|");
		a++;
	}
}
}
}