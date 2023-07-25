package sumOfseries;

public class SumofSeries {
public static double logic(double n) {
	double sum=0;
for (int i=1;i<=n;i++) {
	double x=1/(n-i+1);
	sum=sum+x;
}
return sum;
}
}
