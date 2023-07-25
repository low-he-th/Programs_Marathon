package findgcd;

public class GcD {
public  int findgcd(int num1,int num2)
{
	while(num2!=0) {
		int rem =num1%num2;
		num1=num2;
		num2=rem;
	}
	return num1;
}
}
