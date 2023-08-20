package arrayreplace;

public class Logic {
void RepalceByZero(int arr[])
{
	//int res[]=new int[arr.length];
	
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=arr[i]<0?0:arr[i];
    }
	//return res;
}
}

