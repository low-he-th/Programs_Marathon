package TwoSum;

public class ArrayTwoSum {
public static int[] twosum(int arr[],int target )
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==target)
			{
				return new int[] {i,j};
			}
		}
	}
	return new int[] {-1,-1};
}
}
